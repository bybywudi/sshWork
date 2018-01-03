package vo;

import java.util.List;

public class PageBean<T> {
	
	private List<T> list;
	private int totalrecord;
	private static int pagesize;
	private int totalpage;
	private int currentpage;
	private int previouspage;
	private int nextpage;
	private int[] pagebar;
	
	private static final int PAGE_DISPLAY_NUM = 7;
	
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	public int getTotalrecord() {
		return totalrecord;
	}
	public void setTotalrecord(int totalrecord) {
		this.totalrecord = totalrecord;
	}
	

	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	
	public int getTotalpage() {
		
		if(this.totalrecord%this.pagesize==0) {
			this.totalpage = this.totalrecord/this.pagesize;
		}else {
			this.totalpage = this.totalrecord/this.pagesize + 1;
		}
		
		return totalpage;
	}
	
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	
	public int getCurrentpage() {
		return currentpage;
	}

	public int getPreviouspage() {
		
		
		if(this.currentpage-1 < 1) {
			this.previouspage = 1;
		}else {
			this.previouspage = this.currentpage-1;
		}
		
		return previouspage;
	}

	public int getNextpage() {
		
		if(this.currentpage+1 >= this.totalpage) {
			this.nextpage = this.totalpage;
		}else {
			this.nextpage = this.currentpage + 1;
		}
		
		
		return nextpage;
	}
	
	
	public int[] getPagebar() {
		
		
		
		if(this.totalpage <= PAGE_DISPLAY_NUM) {
			
			int pagebar1[] = new int[this.totalpage];
			
			for(int i=1;i<=this.totalpage;i++) {
				pagebar1[i-1] = i;
			}
			
			this.pagebar = pagebar1;
			
		}else {
			
			int pagebar[] = new int[PAGE_DISPLAY_NUM];
			if(this.currentpage + PAGE_DISPLAY_NUM - 1 > this.totalpage) {
				for(int i=0;i<= PAGE_DISPLAY_NUM-1;i++) {
					pagebar[i] = this.totalpage - PAGE_DISPLAY_NUM + 1 + i;
				}
			}else {
				if(this.currentpage <= (PAGE_DISPLAY_NUM-1)/2) {
					for(int i=0;i<= PAGE_DISPLAY_NUM-1;i++) {
						pagebar[i] = i + 1;
					}
				}else {
					for(int i = this.currentpage - (PAGE_DISPLAY_NUM-1)/2;i <= this.currentpage + (PAGE_DISPLAY_NUM-1)/2;i++) {
						pagebar[i-(this.currentpage - (PAGE_DISPLAY_NUM-1)/2)] = i;
					}
				}
			}
			
			this.pagebar = pagebar;
		}
		
		
		//System.out.println(this.pagebar[0]);
		//System.out.println(this.pagebar[1]);
		//System.out.println(this.pagebar[2]);
		
		return pagebar;
	}

	
	
}
