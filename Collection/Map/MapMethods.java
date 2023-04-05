import java.util.*;

class Main {
    public static void main(String[] args) {

        /*
        Map Interface methods:
        * V stands for object value (Object V)

            V           put(K key, V value)
            V           get(Object key)
            V           remove(Object key)
            V           putAll();

            int         size()
            boolean     isEmpty()

            boolean     containsKey(Object key)
            boolean     containsValue(Object value)


            Set<K>                  keySet()
            Collection<V>           values()
            Set<Map.Entry<K, V>>    entrySet()

            #Map.Entry where entry interface exists
            interface Entry<K,V>
            {
                Methods in Entry:

                K           getKey()
                V           getValue()
                V           setValue(V value)

                //compares keys of two objects in map
                ?? boolean     equals(Object o)
                int         hashCode()

                ??            comparingByKey()
                ??            comparingByValue()

             }

             boolean        equals(Object o)
             int            hashCode()
                            replace(K , oldV , newV)
                            replace(K, V)


            void        clear()


         */
      
        Map<Integer , String> hashMap = new HashMap<>();

        //Inserting values with keys
        hashMap.put(0,"a");
        hashMap.put(1,"b");
        hashMap.put(2,"c");
        hashMap.put(3,"d");
        hashMap.put(4,"e");
        hashMap.put(5,"f");
        hashMap.put(6,"g");
        hashMap.put(7,"h");
        hashMap.put(8,"i");
        hashMap.put(9,"j");

        System.out.println(hashMap);//{0=a, 1=b, 2=c, 3=d, 4=e, 5=f, 6=g, 7=h, 8=i, 9=j}

        System.out.println(hashMap.get(0));

        System.out.println(hashMap.remove(9));

        HashMap<Integer,String> newMap = new HashMap<>();
        newMap.put(10,"k");
        newMap.put(11,"L");

        hashMap.putAll(newMap);
        System.out.println(hashMap);

        System.out.println(hashMap.size());

        System.out.println(hashMap.isEmpty());

        System.out.println(hashMap.containsKey(2));

        System.out.println(hashMap.containsValue("h"));

        System.out.println(hashMap.keySet());//[0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11]

        System.out.println(hashMap.values());//[a, b, c, d, e, f, g, h, i, k, L]

        System.out.println(hashMap.entrySet());//[0=a, 1=b, 2=c, 3=d, 4=e, 5=f, 6=g, 7=h, 8=i, 10=k, 11=L]

        System.out.println(hashMap);
        System.out.println("----");


        for(HashMap.Entry<Integer, String> it:hashMap.entrySet()){

           System.out.println(it.getKey());
           System.out.println(it.getValue());
            if( it.getKey() == 11 )
                it.setValue("new");

        }

        hashMap.replace(11,"L");
        hashMap.replace(11,"new","L");
        System.out.println(hashMap);



    }
}
