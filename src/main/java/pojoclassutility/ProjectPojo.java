package pojoclassutility;

public class ProjectPojo {

		   String createdBy;
		   String status;
		   int teamSize;
		   String projectName;
		   
		   private ProjectPojo()
		   {
			   
		   }

		    public ProjectPojo(String createdBy, String status, int teamSize, String projectName) {
			super();
			this.createdBy = createdBy;
			this.status = status;
			this.teamSize = teamSize;
			this.projectName = projectName;
		}
			public void setCreatedBy(String createdBy) {
		        this.createdBy = createdBy;
		    }
		    public String getCreatedBy() {
		        return createdBy;
		    }
		    
		    public void setStatus(String status) {
		        this.status = status;
		    }
		    public String getStatus() {
		        return status;
		    }
		    
		    public void setTeamSize(int teamSize) {
		        this.teamSize = teamSize;
		    }
		    public int getTeamSize() {
		        return teamSize;
		    }
		    
		    public void setProjectName(String projectName) {
		        this.projectName = projectName;
		    }
		    public String getProjectName() {
		        return projectName;
		    }
		    
		}


