package vo;

public class QuerryInfo {
	private int currentpage;
	private int pagesize;//每页显示的数量
	private int startindex;
	
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getStartindex() {
		this.startindex = (this.currentpage-1)*this.pagesize;
		
		return startindex;
	}

	
	
}
