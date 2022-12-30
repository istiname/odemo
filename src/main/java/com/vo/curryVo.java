package com.vo;

// 定義這個類別為實體，同資料表的意思
@Entity
// 對應到資料庫中名為CURRENCY的資料表
@Table(name = "CURRENCY")
public class curryVo {
	// 宣告這個類別的內容，依照CURRENCY資料表的欄位設計
    // ＠Id表示這個資料表的Primary Key，這張表只有一個Primary Key，不需要另外處理
    @Id
    private String ID;
    private String CURRENCY;
 
    public curryVo() {
 
    }
 
    public curryVo(String ID, String CURRENCY) {
        this.ID = ID;
        this.CURRENCY = CURRENCY;
    }
    
    public void setId(String ID) {
		this.ID = ID;
	}
    public void getId() {
    	return ID;
	}

    public void setCurrrncy(String CURRENCY) {
		this.CURRENCY = CURRENCY;
	}
	public String getCurrrncy() {
		return CURRENCY;
	}
}