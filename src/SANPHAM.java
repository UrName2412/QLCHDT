import java.util.Scanner;

public class SANPHAM {
    public String idSanPham, hang, model, loai, chip;
    private float kichThuoc, gia, khoiLuong;
    private int dungLuong, ram;
    private static int soLuongTong;
    Scanner inp = new Scanner(System.in);

    public SANPHAM() {
        idSanPham = "";
        hang = "";
        model = "";
        kichThuoc = 0;
        gia = 0;
        khoiLuong = 0;
        dungLuong = 0;
        ram = 0;
        chip = "";
        soLuongTong++;
    }

    public SANPHAM(String idSanPham, String hang, String model, float kichThuoc, float gia, float khoiLuong,
            int dungLuong, int ram, String chip) {
        this.idSanPham = idSanPham;
        this.hang = hang;
        this.model = model;
        this.kichThuoc = kichThuoc;
        this.gia = gia;
        this.khoiLuong = khoiLuong;
        this.dungLuong = dungLuong;
        this.ram = ram;
        this.chip = chip;
        soLuongTong++;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    void setHang(String hang) {
        this.hang = hang;
    }

    String getHang() {
        return hang;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    void setKichThuoc(float kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    float getKichThuoc() {
        return kichThuoc;
    }

    void setGia(float gia) {
        this.gia = gia;
    }

    float getGia() {
        return gia;
    }

    void setKhoiLuong(float khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    float getKhoiLuong() {
        return khoiLuong;
    }

    void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    int getDungLuong() {
        return dungLuong;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    int getRam() {
        return ram;
    }

    void setChip(String chip) {
        this.chip = chip;
    }

    String getChip() {
        return chip;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getsoLuongTong() {
        return soLuongTong;
    }

    public void nhap(String idSanPham) {
        this.idSanPham = idSanPham;
        System.out.printf("Nhap hang: ");
        hang = inp.nextLine();
        System.out.printf("Model: ");
        model = inp.nextLine();
        System.out.printf("Kich thuoc: ");
        kichThuoc = inp.nextFloat();
        System.out.printf("Gia: ");
        gia = inp.nextFloat();
        System.out.printf("Khoi luong: ");
        khoiLuong = inp.nextFloat();
        System.out.printf("Dung luong: ");
        dungLuong = inp.nextInt();
        System.out.printf("Ram: ");
        ram = inp.nextInt();
        System.out.printf("Chip: ");
        chip = inp.nextLine();
    }

    public void xuat() {
        System.out.printf("Id san pham: %5s\n", idSanPham);
        System.out.printf("Hang: %10s\n", hang);
        System.out.printf("Model: %s\n", model);
        System.out.printf("Kich thuoc: %.2f\n", kichThuoc);
        System.out.printf("Gia: %.2f\n", gia);
        System.out.printf("Khoi luong: %.2f\n", khoiLuong);
        System.out.printf("Dung luong: %d\n", dungLuong);
        System.out.printf("Ram: %d\n", ram);
        System.out.printf("Chip: %s\n", chip);
    }
}