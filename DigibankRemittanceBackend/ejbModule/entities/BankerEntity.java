package entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="banker_tbl")
public class BankerEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long TransactionCode;

	@Column(name= "Name")
	private String Name;

	@Column(name= "SourcePassport")
	private String SourcePassport;

	@Column(name="DestinationPassport" )
	private String DestinationPassport;

	@Column(name="DestinationBank" )
	private String DestinationBank;

	@Column(name="DestationCountry" )
	private String DestationCountry;

	@Column(name="AccountNumber" )
	private int AccountNumber;

	@Column(name="Amount" )
	private float Amount;


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		SourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return DestinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		DestinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		DestinationBank = destinationBank;
	}
	public String getDestationCountry() {
		return DestationCountry;
	}
	public void setDestationCountry(String destationCountry) {
		DestationCountry = destationCountry;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public float getAmount() {
		return Amount;
	}
	public void setAmount(float amount) {
		Amount = amount;
	}

}
