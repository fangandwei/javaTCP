package javafenye;

import java.util.List;

//T  使用泛型 
public class PageBean<T> {
	
	//八个参数
	
	//当前页，用户请求的数据
	private Integer pageNum;
//	每一页记录数，自己设置的
	private Integer pageSize;
	//总记录数，通过数据库可以查到的
    private Integer 	totalRecord;
//    当前索引，计算得出的
    private Integer	 index;
	//存放实体类的
	private List<T> pojolist;
	//开始页项
	private  Integer   start; 
	//结束页项
	private   Integer   end;
	//总页数
    private   Integer   totalpagenum;
    
   


public    PageBean(Integer totalRecord,Integer pageNum,Integer pageSize)  {
	
	if((totalRecord % pageSize)==0){
		totalpagenum= totalRecord/pageSize;
	}else{
		
		totalpagenum= totalRecord/pageSize+1;
	}
	
	
	
	   this.start=1;
	   this.end=5;
	   //如果总页数小于5.end的值就是该页数的值
	  /*s*/
	   //总页数大于5  start=这页-2
//	               end=这一页+2
//		   如果开始<0
//		   1 .  5
//		   如果结束大于总页数
		 /*  end=总页数
		   开始=end-5*/
	   if(totalpagenum<5){
		   
		   this.end=pageNum;
	   }else{
		   this.start=pageNum-2;
		   this.end=pageNum+2;
		   
		   if(start<0){
			   this.start=1;
			   this.end=5;
		   }
		   if(end>totalpagenum){
			   end=totalpagenum;
			   start=end-5;
			   
		   }
	   }
	   this.index=(pageNum-1)*pageSize;
	   
   } 


public Integer getTotalpagenum() {
	return totalpagenum;
}
    
public Integer getStart() {
		return start;
	}
	public Integer getEnd() {
		return end;
	}
    
    
	public Integer getPageNum() {
		return pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}
	
	public Integer  getTotalRecord() {
		return totalRecord;
	}
	public List<T> getPojolist() {
		return pojolist;
	}
	public void setPojolist(List<T> pojolist) {
		this.pojolist = pojolist;
	}
	
	public Integer getIndex() {
		return index;
	}

	

	
    
	
	
	

}
