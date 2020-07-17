import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Knowledge {
	private String domain;
	private String context;
	private String type;
	private String operation;
	private String contribution_data;
	private String object;
	private String submittedOn;
	private String nativeAskID;
	public String getDomian() {
		return domain;
	}
	public void setDomain(String domian) {
		this.domain = domian;
	}
	public String getDomain() {
		return domain;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getContribution_data() {
		return contribution_data;
	}
	public void setContribution_data(String contribution_data) {
		this.contribution_data = contribution_data;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getSubmittedOn() {
		return submittedOn;
	}
	public void setSubmittedOn(String submittedOn) {
		this.submittedOn = submittedOn;
	}
	public String getNativeAskID() {
		return nativeAskID;
	}
	public void setNativeAskID(String nativeAskID) {
		this.nativeAskID = nativeAskID;
	}


	
	
	
}
