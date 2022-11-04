/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem2;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author HusseinATejan Find the two numbers in a list closest to each other in
 * value
 */
public class FindClosestNumber {

    public static Map solution(double[] A) {
        double next = 0;

        Map<Double, Double> somePairs = new Map<Double, Double>() {
            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isEmpty() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean containsKey(Object key) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean containsValue(Object value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Double get(Object key) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Double put(Double key, Double value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Double remove(Object key) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void putAll(Map<? extends Double, ? extends Double> m) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Set<Double> keySet() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Collection<Double> values() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Set<Map.Entry<Double, Double>> entrySet() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
//        double [][]pairs = null;
        //iterate through array completely
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                //assign next element to next
                next = A[j];
                //check if next element is close to previous element
                if (next == Math.round(A[i])) {
                    somePairs.put(A[i], A[j]);
                } else {
                    somePairs.put(-1.0, -1.0);
                }

            }

        }

        return somePairs;
    }

    public static void main(String[] args) {
        double A[] = {1.0, 3.5, 2.0, 4.0, 5.5, 7.5, 8.0, 8.2};
        double B[] = {3.3, 2.3, 1.7, 4.2, 2.0, 1.0, 3.0};
        
        System.out.println(solution(A));
    }
}
