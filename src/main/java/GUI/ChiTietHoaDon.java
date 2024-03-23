
package project;

public class CTHD {
    private String idHD;
    private String idSP;
    private String tenSp;
    private String idSize;
    private int sl;

    public CTHD(String idHD, String idSP, String tenSp, String idSize, int sl) {
        this.idHD = idHD;
        this.idSP = idSP;
        this.tenSp = tenSp;
        this.idSize = idSize;
        this.sl = sl;
    }

    public CTHD() {
    }

    public String getIdHD() {
        return idHD;
    }

    public String getIdSP() {
        return idSP;
    }

    public String getTenSp() {
        return tenSp;
    }

    public String getIdSize() {
        return idSize;
    }

    public int getSl() {
        return sl;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setIdSize(String idSize) {
        this.idSize = idSize;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return "CTHD{" + "idHD=" + idHD + ", idSP=" + idSP + ", tenSp=" + tenSp + ", idSize=" + idSize + ", sl=" + sl + '}';
    }

    
    
}
