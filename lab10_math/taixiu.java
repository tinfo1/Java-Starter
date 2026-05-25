package lab10_math;

import java.util.Random;
import java.util.Scanner;

public class taixiu {
    public static void main(String[] args) {
        double tk =5000;
        Scanner sc = new Scanner(System.in);
        String luachon = "";
        do {
            System.out.println("-------------- Mời bạn lựa chọn ----------------------");
            System.out.println("Chọn (1) để tiếp tục chơi");
            System.out.println("nhấn phím bất kỳ để thoát");
            luachon = sc.nextLine();
            if (luachon.equalsIgnoreCase("1")) {
                System.out.println("Bắt đầu chơi");
                System.out.println("Tài khoản : "+tk + " , bạn muốn đặt cược bao nhiêu ? ");
                // Đặt cược
                double datcuoc=0;
                do {
                    try {
                        System.out.println("Đặt cược (0 < số tiền cược <="+tk);
                        datcuoc=sc.nextDouble();
                    } catch (NumberFormatException e) {
                        System.err.println("Lỗi: Vui lòng nhập số tiền hợp lệ");
                    }
                    
                } while (datcuoc<=0||datcuoc>tk);

                sc.nextLine();
                // chọn tài xỉu
                String luachontaixiu="";
                
                while (true) {
                    try {
                        System.out.println(" chọn <T> tài hoặc <X> xỉu ");
                        luachontaixiu=sc.nextLine();
                        if (!luachontaixiu.equalsIgnoreCase("T")&& !luachontaixiu.equalsIgnoreCase("x")) {
                            throw new LuachonsaiException("ký tự '"+luachontaixiu+" ' không hợp lệ ! ");
                        }
                        break;
                    } catch (LuachonsaiException e) {
                        System.err.println(e.getMessage());
                    }
                }

                
                // tung xúc xắc
                Random xx=new Random();
                int kq1 =xx.nextInt(6)+1;
                int kq2 =xx.nextInt(6)+1;
                int kq3 =xx.nextInt(6)+1;
                int kq=kq1+kq2+kq3;
                // tính toán kết quả
                System.out.println(" xx : "+ kq1 + " - "+ kq2 + " -" +kq3);
                if (kq == 3 || kq ==18) {
                    System.out.println("Kết quả : "+ kq);
                    System.out.println("Nhà cái ăn hết, bạn đã thua");
                    tk = tk-datcuoc;
                    System.out.println("Tài khoản của bạn : "+ tk);
                }else if (kq>=4 && kq <=10 ) {
                    System.out.println("Kết quả : "+kq);
                        if (luachontaixiu.equalsIgnoreCase("x")) {
                            System.out.println("Bạn đã thắng cược ");
                            tk=tk+datcuoc;
                            System.out.println("Tài khoản của bạn :"+tk);
                        }else {
                            System.out.println("Bạn đã thua cược ");
                            tk=tk-datcuoc;
                            System.out.println("Tài khoản của bạn :"+tk);
                        }
                }else if (kq >=11&&kq<=17) {
                    System.out.println("Kết quả :"+kq);
                        if (luachontaixiu.equalsIgnoreCase("t")) {
                            System.out.println("Bạn đã thắng cược ");
                            tk=tk+datcuoc;
                            System.out.println("Tài khoản của bạn :"+tk);
                        }else {
                            System.out.println("Bạn đã thua cược ");
                            tk=tk-datcuoc;
                            System.out.println("Tài khoản của bạn :"+tk);
                        }
                }
                if (tk <=0) {
                    System.out.println("Bạn đã hết tiền ");
                    System.out.println("GAME OVER.");
                    break;
                }
                
            }
        } while (luachon.equalsIgnoreCase("1"));
        System.out.println("Cảm ơn bạn đã tham gia");
        sc.close();
    }
}
 class LuachonsaiException extends Exception {
    public LuachonsaiException(String message){
        super(message);
    }

}
