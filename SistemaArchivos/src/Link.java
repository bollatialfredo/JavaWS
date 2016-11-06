public class Link extends EFS {
	private EFS link;
	
	public Link(EFS efs,String nomb, int size){
		super(nomb,size);
		link=efs;		
	}
	
	public EFS getLink(){
		return link;
	}
	
	public int getSize(){
		return link.getSize();
	}	

}
