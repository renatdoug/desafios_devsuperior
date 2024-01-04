package entities;

public class Task extends Lesson{
	
	private String description;
	private Integer questonCount;
	public Task() {
		super();
	}
	
	public Task(String title, String description, Integer questonCount) {
		super(title);
		this.description = description;
		this.questonCount = questonCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestonCount() {
		return questonCount;
	}

	public void setQuestonCount(Integer questonCount) {
		this.questonCount = questonCount;
	}

	@Override
	public int duration() {
		// TODO Auto-generated method stub
		return questonCount * 5;
	}
	
	
	
	

}
