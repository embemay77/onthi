import java.util.List;
import java.util.ArrayList;
class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;

    // Constructor
    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    // Getter & Setter
    public String getMaSV() {
        return maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    // Xếp loại
    public String xepLoai() {
        if (diemTB >= 8)
            return "Gioi";
        if (diemTB >= 6.5)
            return "Kha";
        if (diemTB >= 5)
            return "Trung binh";
        return "Yeu";

    }

    // Hiển thị
    public void hienThi() {
        System.out.println(maSV + " | " + hoTen + " | " + diemTB + " | " + xepLoai());
    }

    // Tìm sinh viên điểm cao nhất
    public static SinhVien findTopStudent(List<SinhVien> list) {
        SinhVien sv = new SinhVien(null, null, 0);
        double max = 0;
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).diemTB > max) {
                sv = list.get(i);
                max = list.get(i).diemTB;
            }
            i++;
        }
        return sv;

    }

    // Sắp xếp giảm dần theo điểm
public static void sortByScore(List<SinhVien> list) {
    for(int i=0;i<list.size()-1;i++){
        for(int k=i+1;k<list.size();k++){
            if(list.get(k).diemTB>list.get(i).diemTB){
                SinhVien sv=list.get(k);
                list.set(k,list.get(i));
                list.set(i,sv);
            }
        }
    }
   for (SinhVien sv : list) {
            sv.hienThi();
        }
}

    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("SV01", "An", 7.5));
        list.add(new SinhVien("SV02", "Binh", 9.0));
        list.add(new SinhVien("SV03", "Cuong", 6.0));

        for (SinhVien sv : list) {
            sv.hienThi();
        }

        SinhVien top = findTopStudent(list);
        System.out.println("Top: ");
        top.hienThi();

        sortByScore(list);
    }
}