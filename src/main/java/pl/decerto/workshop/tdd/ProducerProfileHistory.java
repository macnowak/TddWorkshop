package pl.decerto.workshop.tdd;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(exclude = "producerProfile")
public class ProducerProfileHistory {

	public enum ChangeType {
		EAGENT_ACCESS_CHANGE,
		NEWS_ACCESS_CHANGE,
		SETTLEMENT_MANAGEMENT_CHANGE,
		DISCOUNT_MANAGEMENT_CHANGE,
		SALES_MANAGEMENT_CHANGE,
		POLICY_PROPERTY_VISIBILITY_CHANGE,
		POLICY_LIFE_VISIBILITY_CHANGE,
		OFFER_PROPERTY_VISIBILITY_CHANGE,
		OFFER_LIFE_VISIBILITY_CHANGE
	}

	private ProducerProfile producerProfile;

	private ChangeType changeType;

	private String newValue;

	private Long producerProfileVersion;

	private LocalDateTime creationDate;

	private ProducerProfileHistory() {
	}

	ProducerProfileHistory(ProducerProfile producerProfile, ChangeType changeType, String newValue, Long
			producerProfileVersion) {
		this.producerProfile = producerProfile;
		this.changeType = changeType;
		this.newValue = newValue;
		this.producerProfileVersion = producerProfileVersion;
		this.creationDate = LocalDateTime.now();
	}
}
