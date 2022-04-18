package pl.krzychuuweb.workshop.car;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import pl.krzychuuweb.workshop.car.dto.CarDTO;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private CarRepository carRepository;

    @Test
    @Transactional
    void should_get_car_by_registration_number() throws Exception {
        Car car = carRepository.save(CarObjectMotherTest.newCar().build());

        MvcResult mvcResult = mockMvc.perform(get("/cars/" + car.getRegistrationNumber()))
                .andExpect(status().is(200))
                .andReturn();

        CarDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), CarDTO.class);

        assertThat(response.registrationNumber()).isEqualTo(car.getRegistrationNumber());
    }
}