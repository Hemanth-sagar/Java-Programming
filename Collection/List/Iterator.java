        

         /*
            List Iterator:
             next,hasNext,previous,hasPrevious
             nextIndex,previousIndex,add,set,remove

         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator it = list.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //to start with specific index
        ListIterator it2 = list.listIterator(1);

        //to start with end
        ListIterator it3 = list.listIterator(list.size());

        while(it3.hasPrevious()){
            System.out.println(it3.previous());
        }

        //remove all null values
        list.add(null);
        list.add(5);
        list.add(6);
        list.add(null);
        System.out.println(list);

        while (it.hasNext()){
            if(it.next()==null){
                it.remove();
                it.set(0);
                it.add(1);
            }
        }
        System.out.println(list);



