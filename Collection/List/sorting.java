class Main {
    public static void main(String[] args) {
       
        //sorting asc and desc
        //1
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(16);
        array.add(12);
        array.add(18);

        System.out.println(array);//[1, 16, 12, 18]

        Collections.sort(array);
        System.out.println(array);//[1, 12, 16, 18]

        //to reverse sorted elements
        Collections.reverse(array);
        System.out.println(array);//[18, 16, 12, 1]

        //2
        List<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(16);
        array2.add(12);
        array2.add(18);

        Collections.sort(array2,Comparator.reverseOrder());
        System.out.println(array2);//[18, 16, 12, 1]
      
        //3 to sort array
        //Ascending
        int array3[] = {12,89,76,67};

        Arrays.sort(array3);
        for(int ele : array3)
        System.out.println(ele);

        //Descending
        List<Integer> conArray = new ArrayList<>();
        
        for(int i=0;i<array3.length;i++){
            conArray.add(Integer.valueOf(array3[i]));
        }

        Collections.sort(conArray,Comparator.reverseOrder());
        System.out.println(conArray);//[89, 76, 67, 12]
      
   }
}
