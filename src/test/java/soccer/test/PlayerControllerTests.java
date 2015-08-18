package soccer.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import soccer.web.PlayerController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class PlayerControllerTests {

    @Test
    public void testRegisterPlayerPage() throws Exception {
        PlayerController controller = new PlayerController();
        MockMvc mockMvc =
                standaloneSetup(controller).build();
        mockMvc.perform(get("/players/registerPlayer"))
                .andExpect(view().name("registerPlayer"));
    }

}