package lab16_OOP.vd_interface.maytinhbotui;

public class sxchen implements Isapxep {
    @Override
    // sắp xếp chèn tăng dần
    public void sapxeptang(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }

    @Override
    // sắp xếp chèn giảm 
    public void sapxepgiam(double[] arr) {
      int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }
}
