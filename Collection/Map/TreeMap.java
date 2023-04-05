class Main {
    public static void main(String[] args) {
        
        /*
         Methods in TreeMap:
            put, get, containsKey, containsValue, replace, remove, clear, keySet,
            values, entrySet (common for hashMap)
            firstEntry, lastEntry, firstKey, lastKey, pollFirstEntry, pollLastEntry

         */
        TreeMap<Character, Integer> tm = new TreeMap<>();
        tm.put('b', 1000);
        tm.put('a',2000);
        tm.put('c',4000);
        tm.put('d',5000);

        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.pollFirstEntry());
        System.out.println(tm.pollLastEntry());
        System.out.println(tm);

    }
}
