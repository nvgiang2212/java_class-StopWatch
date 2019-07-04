import java.util.Arrays;

public class Watch {
    public static void main(String[] args) {
        double[] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100000;
        }
        StopWatch Watch = new StopWatch();
        Watch.start();
        for (int k = 0; k < arr.length; k++) {
            int min_idx = k;
            for (int j = k+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            double temp = arr[min_idx];
            arr[min_idx] = arr[k];
            arr[k] = temp;
        }
        Watch.stop();
        Watch.getElapsedTime();
        System.out.println("Thoi gian thuc thi cua thuat toan sap xep 100000 so la: " + (Watch.getElapsedTime() / 1000)  + " giay");
    }
}