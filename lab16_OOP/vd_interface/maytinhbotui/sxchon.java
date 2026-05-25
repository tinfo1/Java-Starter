package lab16_OOP.vd_interface.maytinhbotui;

public class sxchon implements Isapxep {
    @Override
    // sắp xếp chọn 
    public void sapxeptang(double[] arr) {
        int n = arr.length;
        int i,j,min_idx;
        for (i = 0 ; i < n-1 ; i++) {
            min_idx= i;
            for (j =i+ 1; j < n; j++) {
                if (arr[j]<arr[min_idx]) {
                    min_idx=j;
                double temp = arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
                }
            }
        }

    }

    @Override
   // Sắp xếp chọn giảm dần
public void sapxepgiam(double[] arr) {
    int n = arr.length;
    int i, j, max_idx;
    for (i = 0; i < n - 1; i++) {
        // 1. Giả định phần tử đầu tiên của dãy chưa sắp xếp là lớn nhất
        max_idx = i;

        // 2. Chạy vòng lặp j để tìm số thực sự lớn nhất trong phần còn lại
        for (j = i + 1; j < n; j++) {
            if (arr[j] > arr[max_idx]) { // Đổi dấu thành > để tìm số lớn nhất
                max_idx = j;
            }
        }

        // 3. Sau khi tìm xong số lớn nhất, mới thực hiện đổi chỗ (nằm ngoài vòng lặp j)
        double temp = arr[max_idx];
        arr[max_idx] = arr[i];
        arr[i] = temp;
    }
}
}
