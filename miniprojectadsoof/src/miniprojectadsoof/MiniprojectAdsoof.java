
package miniprojectadsoof;




public class MiniprojectAdsoof {

    public static void main(String[] args) {

        WordStoreImp gg= new WordStoreImp(100);
        
        
          System.out.println("The  index should be of crap  and it's :"+gg.hashfunction("crap"));
       gg.add("crap");
//        gg.add("crap");
//        gg.add("crap");
//        gg.add("crap");
//        gg.add("crap");
//        gg.add("crap");
//        gg.add("dog");
//        gg.add("dog");
        gg.add("vuhy");
        gg.add("vuhy");
        gg.add("vuhy");
        gg.add("coss");
        gg.add("coss");
        gg.add("coss");
        gg.add("dodo");
        gg.add("momo");
        gg.add("landen");
        gg.add("firebrigade");
        gg.add("help");
        
//        gg.add("a");
//        gg.add("ab");
        System.out.println("With dodo inside");
        gg.printItems();
//        System.out.println("crap in the hashtable  "+gg.count("crap"));
//        System.out.println("dog in the hashtable  "+gg.count("dog"));
//        System.out.println("dog should be removed");
//        gg.remove("dog");
//        gg.remove("dog");
//        gg.remove("crap");
//        gg.remove("crap");
//        gg.remove("crap");
//        gg.remove("crap");
//        gg.remove("crap");
//        gg.remove("crap");
//        gg.remove("vuhy");
//        gg.remove("vuhy");
//    
//        gg.remove("coss");
//        gg.remove("dodo");
//        gg.remove("momo");
//        gg.remove("landen");
//        gg.remove("firebrigade");
//        gg.remove("help");
//        gg.remove("coss");
//        gg.remove("coss");
//    
        System.out.println("This should remove dodo");
        gg.remove("dodo");
       gg.printItems();
//        System.out.println(gg.getByKey(0));
//        System.out.println("dog in the hashtable  "+gg.count("dog"));
//        
   
       
        
    }
}
