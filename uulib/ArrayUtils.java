package uulib;

import java.util.Random;

public class ArrayUtils {

    public static int[] reverse(int[] data) {
        int[] copy = new int[data.length];
        for(int l=0,r=data.length-1; l<data.length; l=l+1, r=r-1) {
            copy[r] = data[l]; 
        }
        return copy;
    }

    public static void reverseAction(int[] data) {
        for(int l=0,r=data.length-1; l!=r; l=l+1, r=r-1) {
            int temp = data[l];
            data[l] = data[r];
            data[r] = temp; 
        }
    }

    public static void fillWithRandomData(int[] data) {
        Random random = new Random();    
        for(int i=0; i<data.length; i=i+1){
            data[i] = random.nextInt(99) + 1;
        }
    }

    // return smallest element in data array (assumes array contains at least 1 element)
    public static int smallest(int[] data) {
        int small = data[0]; // assume first element is smallest
        for (int i=0; i<data.length; i=i+1) {
            if (data[i] < small) {
                small = data[i];
            }
        }
        return small;
    }

    // return largest element in data array (assumes array contains at least 1 element)
    public static int largest(int[] data) {
        int large = data[0]; // assume first element is largest
        for (int i=0; i<data.length; i=i+1) {
            if (data[i] > large) {
                large = data[i];
            }
        }
        return large;
    }

    // counts number of array elements below specified value
    public static int countBelow(int[] data, int below) {
        int count = 0;
        for (int i=0; i<data.length; i=i+1) {
            if (data[i] < below) {
                count = count + 1;
            }
        }
        return count;
    }

     // counts number of array elements above specified value
    public static int countAbove(int[] data, int above) {
        int count = 0;
        for (int i=0; i<data.length; i=i+1) {
            if (data[i] > above ) {
                count = count + 1;
            }
        }
        return count;
    }

    // calculate average value in array
    public static int average(int[] data) {
        int total = 0;
        for (int i=0; i< data.length; i=i+1) {
            total = total + data[i];
        }
        int avg = 0;
        if (data.length > 0) {
            avg = total / data.length;
        }
        return avg;
    }

    // check if first and last array elements are equal (the same)
    public static boolean firstLastSame(int[] data) {
        if (data[0] == data[data.length - 1]) {
            return true;
        }
        return false;        
    }

    public static String intArrayToString(int[] data) {
        // check data exists
        if (data == null) return "";

        String s = "{";
        for (int i=0 ; i<data.length; i=i+1) {
            s = s + data[i];
            if (i != data.length-1) {
                s = s + ",";
            }
        }
        s = s + "}";
        return s;
    }
 
}