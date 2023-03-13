class Main {
    public static void main(String[] args) {
      
      Collection<String> employees = new ArrayList<>();

        /*
        Collection methods for all interfaces:

            boolean     add() - inserts the specified element to the collection
                        addAll() - adds all the elements of a specified collection to the collection

            int         size() - returns the size of the collection
            boolean     isEmpty() - returns true if collection contains at least one element
            boolean     contains() - returns true if this collection contains the specified element
            Object[]    toArray() - returns an array containing all of the elements in this collection
            Iterator<>  iterator() - returns an iterator to access elements of the collection

            boolean     containsAll( Collection<?> c) - Returns true if this collection contains all of the
                                                        elements in the specified collection

            boolean     remove(Object o) - Removes a single instance of the specified element from this collection
                        removeAll() - removes all the elements of the specified collection from the collection

            void        clear() - removes all the elements of the collection

         */

        employees.add("Sankar");
        employees.add("Sagar");

        System.out.println(employees);

        List<String> newList = new ArrayList<>();
        newList.add("Sam");
        newList.add("Shiva");
        System.out.println(newList);

        employees.addAll(newList);
        System.out.println(employees);

        System.out.println(employees.size());

        System.out.println(newList.isEmpty());

        System.out.println(employees.contains("Sagar"));

        String[] empArray = employees.toArray(new String[0]);
        /*
            String[] empArray = employees.toArray();
            new String[0] - without gives error
            toArray() method in Java returns an array of type Object[], not String[].
            To fix the error, you need to pass an array of the correct type as an argument to the toArray() method

         */
        for(String ar:empArray)  System.out.println(ar);

        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(employees.containsAll(newList));

        employees.remove("Sagar");
        System.out.println(employees);

        employees.removeAll(newList);
        System.out.println(employees);

        employees.clear();
        System.out.println(employees);



    }
}
