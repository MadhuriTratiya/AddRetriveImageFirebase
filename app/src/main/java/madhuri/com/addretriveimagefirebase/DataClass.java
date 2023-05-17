package madhuri.com.addretriveimagefirebase;

public class DataClass {

    private String datatitle;
    private String datadescription;
    private String dataimage;

    public DataClass(String datatitle, String datadescription) {
        this.datatitle = datatitle;
        this.datadescription = datadescription;
        this.dataimage = dataimage;
    }

    public String getDatatitle() {
        return datatitle;
    }

    public void setDatatitle(String datatitle) {
        this.datatitle = datatitle;
    }

    public String getDatadescription() {
        return datadescription;
    }

    public void setDatadescription(String datadescription) {
        this.datadescription = datadescription;
    }

    public String getDataimage() {
        return dataimage;
    }

    public void setDataimage(String dataimage) {
        this.dataimage = dataimage;
    }
}
