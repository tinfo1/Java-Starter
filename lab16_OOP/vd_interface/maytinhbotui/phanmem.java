package lab16_OOP.vd_interface.maytinhbotui;
public class phanmem  implements Imaytinhbotui,Isapxep {

    @Override
    public double cong(double a, double b) {
    
       return a+b;
    }

    @Override
    public double tru(double a, double b) {
       
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
       
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
    
        if(b!=0){
            return a/b;
        }else{
            System.out.println("Lỗi: Không thể chia cho 0");
            return Double.NaN; // Trả về NaN để biểu thị lỗi
        }
        
    }

    @Override
    public void sapxeptang(double[] arr) {
     int n = arr.length;
        int i,j,min_idx;
        for (i = 0 ; i < n-1 ; i++) {
            min_idx= i;
            for (j =i+ 1; j < n; j++) {
                if (arr[j]<arr[min_idx]) {
                    min_idx=j;
                
                }
            }
            double temp = arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
        }
        
    }

    @Override
    public void sapxepgiam(double[] arr) {
         int n = arr.length;
        int i,j,max_idx;
        for (i = 0 ; i < n-1 ; i++) {
            max_idx= i;
            for (j =i+ 1; j < n; j++) {
                if (arr[j]>arr[max_idx]) {
                    max_idx=j;
                
                }
            }
        double temp = arr[max_idx];
                arr[max_idx]=arr[i];
                arr[i]=temp;
        }
        
    }
    
}
