package Q9;

class Main {
    public static void main(String[] args) {
        int[] arr = {0, -6, -1, -20, 7, 9, 4};
        Bubble bubbleSort = new Bubble();
        Quick quickSort = new Quick();
        SortMachine sortMachine = new SortMachine(arr, quickSort);
        sortMachine.runSort();

        for(int element : sortMachine.getArr()) {
            System.out.println(element);
        }
    }
}

