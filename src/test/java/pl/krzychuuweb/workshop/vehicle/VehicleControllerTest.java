package pl.krzychuuweb.workshop.vehicle;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import pl.krzychuuweb.workshop.vehicle.dto.VehicleDTO;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class VehicleControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private VehicleRepository vehicleRepository;

    @Test
    @Transactional
    void should_get_vehicle_by_vin_number() throws Exception {
        Vehicle vehicle = vehicleRepository.save(VehicleObjectMotherTest.newCar().build());

        MvcResult mvcResult = mockMvc.perform(get("/vehicles/" + vehicle.getVinNumber()))
                .andExpect(status().is(200))
                .andReturn();

        VehicleDTO response = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), VehicleDTO.class);

        assertThat(response.registrationNumber()).isEqualTo(vehicle.getRegistrationNumber());
    }
}