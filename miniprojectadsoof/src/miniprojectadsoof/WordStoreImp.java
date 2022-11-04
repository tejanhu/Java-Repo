package miniprojectadsoof;

import java.util.ArrayList;

public class WordStoreImp implements WordStore {

    public int size_hashtable;
    private String[] values;
    private int[] freq;
    private Link[] l;
    private int loadfactor=size_hashtable/2;
    private int amountofelements=0;

    public WordStoreImp(int thesize) {
        size_hashtable = thesize;

        values = new String[thesize];
        freq = new int[thesize];
        l = new Link[thesize];

    }

    @Override
    public void add(String word) {
        if (wordExists(word)) {
            return;
        } else if (values[hashfunction(word)] == null) {
            amountofelements=amountofelements+1;
            values[hashfunction(word)] = word;
            freq[hashfunction(word)] = getFreq()[hashfunction(word)] + 1;
        } else {

            dofurtherchecks(word);
        }
        
//        if (amountofelements>=loadfactor) {
//            setSize_hashtable(size_hashtable*2+1);
//            String somevalue[]= new String[size_hashtable];
//            int somefreq[]= new int [size_hashtable];
//            insertValues(somevalue,somefreq);
//        }
        
        
    }

    @Override
    public int count(String word) {
        if (values[hashfunction(word)] == null) {
            return 0;
        }
        return checkOcc1(word);
    }

    @Override
    public void remove(String word) {
        try {
            if (values[hashfunction(word)].equalsIgnoreCase(word)) {
                if (removeFirstOccword(word)) {
                    return;
                }
                putLinksInRemovedPos(word, hashfunction(word));

            } else {
                removeJob1(word);
            }

        } catch (NullPointerException e) {
            return;
        }
    }

    public int hashfunction(String word) {
        int value = word.hashCode() % size_hashtable;
        if (value < 0) {
            value = value * -1;
        }
        return value;
    }

    public Link checkforNullLink(String word, Link somelink) {
        while (somelink != null) {
            somelink = somelink.next;
            if (somelink == null) {
                break;
            }
        }
        return somelink;
    }

    public boolean checkforsamewordNullLink(String word, Link somelink) {
        System.out.println("The word in the link :" + somelink.getValue() + " the index " + hashfunction(word));
        while (somelink != null) {
            if (somelink == null) {
                break;
            }
            if (somelink.value.equals(word)) {
                somelink.frequency = somelink.frequency + 1;
                return true;
            }
            somelink = somelink.next;
        }
        return false;
    }

    public void constructNewHashTable(String word, String[] newvalues, int[] newfreq) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
            } else if (values[i].equalsIgnoreCase(word)) {
//                putLinksInRemovedPos(word, i);
            } else {
//                System.out.println(values[i]);
//                System.out.println(hashfunction(values[i]) + " it should be stored in new index of ");
//                System.out.println(getFreq()[i]);
                newvalues[hashfunction(values[i])] = values[i];
                newfreq[hashfunction(newvalues[hashfunction(values[i])])] = getFreq()[i];
            }

        }
        values = newvalues;
        freq = newfreq;
    }

    public void printItems() {
        System.out.println("Words in  the hashtable");
        for (String somewords : values) {
            if (somewords != null) {
                System.out.println("Key :" + hashfunction(somewords) + " Word stored :  " + somewords + "  and occurence is  " + getFreq()[hashfunction(somewords)]);

                printhelp(somewords);


            }

        }
    }

    public void setSize_hashtable(int size_hashtable) {
        this.size_hashtable = size_hashtable;
    }

    public boolean wordExists(String word) {
        if (values[hashfunction(word)] == null) {
            return false;
        }
        if (values[hashfunction(word)].equalsIgnoreCase(word)) {
            freq[hashfunction(word)] = freq[hashfunction(word)] + 1;
            return true;
        }
        return false;
    }

    public void dofurtherchecks(String word) {

        if (l[hashfunction(word)] == null) {
            l[hashfunction(word)] = new Link(word, null);
            l[hashfunction(word)].frequency = 1;

        } else {
            if (checkOccInLink(l[hashfunction(word)], word)) {
                return;
            }
            addnewLink(word);

        }
    }

    public String getByValue(String word) {
        return values[hashfunction(word)];
    }

    public String getByKey(int index) {
        return values[index];
    }

    public void printhelp(String somewords) {
        int countforlink = 0;
        Link somelink = l[hashfunction(somewords)];
        if (somelink != null) {

            System.out.println("Words stored in the linked of this key (index)");
            while (somelink != null) {
                countforlink = countforlink + 1;
                System.out.println(somelink.getValue() + " and the occurence   " + somelink.frequency + "    ---->");
                somelink = somelink.next;
                if (somelink == null) {
                    System.out.println("End of the link in key and the amount of items  in link " + countforlink);
                    return;
                }
            }

        }


    }

    public boolean checkWordExistsinLInk(String word) {
        if (l[hashfunction(word)].value == word) {
            l[hashfunction(word)].frequency = l[hashfunction(word)].frequency + 1;
            return true;
        }
        return false;
    }

    public int checkocc(Link somelink, String word) {
        while (somelink != null) {
            if (somelink.getValue().equalsIgnoreCase(word)) {
                return somelink.getFrequency();
            }
            somelink = somelink.next;
        }
        return 0;
    }

    public int checkOcc1(String word) {
        if (values[hashfunction(word)].equalsIgnoreCase(word)) {
            return getFreq()[hashfunction(word)];
        } else {
            Link somelink = l[hashfunction(word)];
            if (somelink == null) {
                return 0;
            }
            return checkocc(somelink, word);


        }
    }

    public void addnewLink(String word) {
        String word1 = word.trim();
        Link somelink = l[hashfunction(word1)];
//        testvalue(word);

        while (somelink.next != null) {
            if (checkOccInLink(somelink, word)) {
//                System.out.println("We get here  "+somelink.value+" and the next stuff "+somelink.next.value);
                return;
            }
            somelink = somelink.next;
            if (checkOccInLink(somelink, word)) {
//                System.out.println("We get here  "+somelink.value+" and the next stuff "+somelink.next.value);
                return;
            }



//                  System.out.println("We're checking for null");
        }
        //                  System.out.println("We' found it and this should create a new link");

        somelink.next = new Link(word, null);
        somelink.next.frequency = 1;

    }

    public void testvalue(String word) {
        System.out.println("This word should be in the Link " + word + " and this should be in index  " + hashfunction(word) + " and the current word in the link    " + l[hashfunction(word)].value);
    }

    public void removeJob1(String word) {
        Link somelink = l[hashfunction(word)];

        try {
            checkFirstLink(word);
            while (somelink.next != null) {
                if (somelink == null) {

                    return;
                }
                if (somelink.next.getValue().equalsIgnoreCase(word)) {
                    break;
                }
                somelink = somelink.next;
            }
            removeInLinks(somelink);

        } catch (NullPointerException e) {
//            System.out.println("The word doesn't exist so you can't remove it");
            return;
        }
    }

    public boolean checkOccInLink(Link somelink, String word1) {
        if (somelink.getValue().equalsIgnoreCase(word1)) {
//            System.out.println("found the word  " + word1 + "  this should be incremented" + " and the index in the linklist should be " + hashfunction(word1));

            somelink.frequency = somelink.frequency + 1;
            return true;
        }

        return false;
    }

    public void insertValues( String newvalues[], int[] newfreq) {
        Link [] newlink = new Link[size_hashtable];
        for (String someword : values) {
            if (someword == null) {
            }  else {
                if(newvalues[hashfunction(someword)]==null){
                     newvalues[hashfunction(someword)] = someword;
                newfreq[hashfunction(someword)] = getFreq()[hashfunction(someword)];
                }
               
                else{
                  
                    newlink[hashfunction(someword)] = new Link(someword, null);
                    newlink[hashfunction(someword)].frequency= freq[hashfunction(someword)];
                }
                
            }

        }
        
        values = newvalues;
        freq = newfreq;

    }

    public int[] getFreq() {
        return freq;
    }

    public boolean removeFirstOccword(String word) {
        if (freq[hashfunction(word)] > 1) {
            freq[hashfunction(word)] = freq[hashfunction(word)] - 1;
            return true;
        }
        return false;
    }

    public void putLinksInRemovedPos(String word, int i) {
        Link someLink = l[hashfunction(word)];

        if (someLink == null) {
            setSize_hashtable(this.size_hashtable - 1);
            String newvalues[] = new String[size_hashtable];
            int newfreq[] = new int[size_hashtable];
            constructNewHashTable(word, newvalues, newfreq);
            return;
        } else {

            values[i] = someLink.getValue();
            freq[i] = someLink.getFrequency();
//            System.out.println(i);
//            System.out.println(values[i]);
//            System.out.println(freq[i]);

            l[hashfunction(word)] = l[hashfunction(word)].next;
        }
    }

    public void removeInLinks(Link somelink) {
        if (somelink.next.frequency > 1) {
            somelink.next.frequency = somelink.next.frequency - 1;
        } else {
//            somelink.frequency = somelink.next.frequency;
//            somelink.setValue(somelink.next.value);
//            somelink.next = somelink.next.next;
            somelink.next = somelink.next.next;
        }
    }

    public void checkFirstLink(String word) {
        if (l[hashfunction(word)].value.equalsIgnoreCase(word)) {

            if (l[hashfunction(word)].frequency > 1) {
                l[hashfunction(word)].frequency = l[hashfunction(word)].frequency - 1;
            } else {
                l[hashfunction(word)] = l[hashfunction(word)].next;

            }

        }
    }

    public class Link {

        public String value;
        public int frequency = 0;
        public Link next;

        public String getValue() {
            return value;
        }

        public int getFrequency() {
            return frequency;
        }

        /**
         * @param value the value to set
         */
        public void setValue(String somevalue) {
            value = somevalue;
        }

        public Link(String value, Link next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
    }
}
