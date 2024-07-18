// Explanation:
// Initialization:

// small and secsmall are initialized to Integer.MAX_VALUE to ensure any number in the array will be smaller.
// lar and seclar are initialized to Integer.MIN_VALUE to ensure any number in the array will be larger.
// Finding Second Smallest:

// Traverse through the array.
// Update small and secsmall accordingly:
// If the current element i is smaller than small, update secsmall to small and then update small to i.
// Otherwise, if i is smaller than secsmall and not equal to small, update secsmall to i.
// Finding Second Largest:

// Similarly, update lar and seclar:
// If i is larger than lar, update seclar to lar and then update lar to i.
// Otherwise, if i is larger than seclar and not equal to lar, update seclar to i.
// Output:

// Print the original array.
// Print the second smallest and second largest values found.




public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] array = { 12, 35, 1, 10, 34, 1 };

        int small=Integer.MAX_VALUE;
        int secsmall=Integer.MAX_VALUE;
        int lar=Integer.MAX_VALUE;
        int seclar=Integer.MAX_VALUE;
        for (int i : array) {
            if(i<small){
                secsmall=small;
                small=i;
            }else if(i<secsmall && i!=small){
                secsmall=i;
            }
        }
    }
}
