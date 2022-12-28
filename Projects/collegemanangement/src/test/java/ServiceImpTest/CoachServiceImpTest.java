package ServiceImpTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.college.entity.Coach;
import com.college.repository.CoachRepository;
import com.college.service.CoachService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@SpringBootTest
public class CoachServiceImpTest {

	@Autowired
	private CoachService coachService;
	@MockBean
	private CoachRepository coachRepository;
	
	@DisplayName(value = "Create Coach Positive Test")
	@Test
	
	void createCoachTest() {
		
		Coach coach=new Coach();
		coach.setCoach_name("Jyoti");
		coach.setCity("Pune");
		coach.setCountry("India");
		coach.setPhone_no(990876743);
		
		Mockito.when(coachRepository.save(coach)).thenReturn(coach);
		assertThat(coachService.createCoach(coach)).isEqualTo("New Coach is assign ..");
	}
	
	@Test
	void getCoach()
	{
		Coach coach=Coach.builder().coach_name("Jyoti").city("Pune").country("India").phone_no(990876743).build();
		Mockito.when(coachRepository.save(coach)).thenReturn(coach);
		assertEquals(coach.getCoach_name() ,"Jyoti");
	}
	
}
