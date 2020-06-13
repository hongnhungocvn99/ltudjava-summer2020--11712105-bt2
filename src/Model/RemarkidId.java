package Model;
// Generated Jun 13, 2020 12:13:38 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * RemarkidId generated by hbm2java
 */
public class RemarkidId  implements java.io.Serializable {


     private int no;
     private String name;
     private Date dateFrom;
     private Date dateTo;

    public RemarkidId() {
    }

	
    public RemarkidId(int no) {
        this.no = no;
    }
    public RemarkidId(int no, String name, Date dateFrom, Date dateTo) {
       this.no = no;
       this.name = name;
       this.dateFrom = dateFrom;
       this.dateTo = dateTo;
    }
   
    public int getNo() {
        return this.no;
    }
    
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateFrom() {
        return this.dateFrom;
    }
    
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }
    public Date getDateTo() {
        return this.dateTo;
    }
    
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RemarkidId) ) return false;
		 RemarkidId castOther = ( RemarkidId ) other; 
         
		 return (this.getNo()==castOther.getNo())
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) )
 && ( (this.getDateFrom()==castOther.getDateFrom()) || ( this.getDateFrom()!=null && castOther.getDateFrom()!=null && this.getDateFrom().equals(castOther.getDateFrom()) ) )
 && ( (this.getDateTo()==castOther.getDateTo()) || ( this.getDateTo()!=null && castOther.getDateTo()!=null && this.getDateTo().equals(castOther.getDateTo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNo();
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         result = 37 * result + ( getDateFrom() == null ? 0 : this.getDateFrom().hashCode() );
         result = 37 * result + ( getDateTo() == null ? 0 : this.getDateTo().hashCode() );
         return result;
   }   


}


