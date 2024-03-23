
package project;

import java.util.Date;

public class HoaDon {
    private String idHD, idKH, idNV;
    private Date ngayHD;
    private int tongTT;

    public HoaDon(String idHD, String idKH, String idNV, Date ngayHD, int tongTT) {
        this.idHD = idHD;
        this.idKH = idKH;
        this.idNV = idNV;
        this.ngayHD = ngayHD;
        this.tongTT = tongTT;
    }

    public String getIdHD() {
        return idHD;
    }

    public String getIdKH() {
        return idKH;
    }

    public String getIdNV() {
        return idNV;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public int getTongTT() {
        return tongTT;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public void setTongTT(int tongTT) {
        this.tongTT = tongTT;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "idHD=" + idHD + ", idKH=" + idKH + ", idNV=" + idNV + ", ngayHD=" + ngayHD + ", tongTT=" + tongTT + '}';
    }
    
    
}
