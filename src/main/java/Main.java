import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main driver code.
 */
public class Main {
    /**
     * main method.
     * @param args take arguments from command line.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        // for size of list
        System.out.print("\n Enter size of arrayList: ");
        final int listSize = scanner.nextInt();
        List<Integer> numberList = new ArrayList<>(listSize);
        int elementCounter = 1;
        // for input
        while (elementCounter <= listSize) {
            System.out.print("\n Enter element " + elementCounter + ": ");
            numberList.add(scanner.nextInt());
            elementCounter++;
        }

        System.out.print("\n Enter the value of k places : ");
        final int kNear = scanner.nextInt();
        System.out.println("\n\n Enter ArrayList:\n " + numberList);
        //KSorting Object creation.
        KSorting kSorting = new KSorting();
        List<Integer> sortedList;
        //calling KSort method of KSorting Class
        sortedList = kSorting.kSort(numberList, kNear);
        System.out.println("\n\n ArrayList After Sorting:\n " + sortedList);
    }
}
