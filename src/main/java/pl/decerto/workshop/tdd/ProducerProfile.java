package pl.decerto.workshop.tdd;

import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ProducerProfile {

	private Long version;

	private boolean eAgentEnabled;

	private boolean newsEnabled;

	private boolean discountManagementEnabled;

	private boolean hasRauNumber;

	private InsuranceGroupScope salesManagement;

	private InsuranceGroupScope settlementManagement;

	private VisibilityScope policyPropertyVisibility;

	private VisibilityScope policyLifeVisibility;

	private VisibilityScope offerPropertyVisibility;

	private VisibilityScope offerLifeVisibility;

	private Set<ProducerProfileHistory> changeHistory = new HashSet<>();

	ProducerProfile() {
	}

}
