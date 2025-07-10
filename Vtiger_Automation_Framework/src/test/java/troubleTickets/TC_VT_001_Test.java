package troubleTickets;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
import objectrepository.TroubleTicketsPage;

@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass {

	@Test
	public void createTicket() {
		
		HomePage hp=new HomePage(driver);
		
		hp.getTroubleTicketsTabLink().click();
		
		TroubleTicketsPage tp = new TroubleTicketsPage(driver);
		
		tp.getCreateTicketLink().click();

		wutil.selectByValue(tp.getTicketStatusDropDown(), "Closed");
		
	}

}
