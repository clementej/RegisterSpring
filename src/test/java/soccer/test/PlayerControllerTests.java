package soccer.test;

import soccer.config.FactoryClass;

public class PlayerControllerTests {

    FactoryClass factory=new FactoryClass();
    
  /*
    @Test
    public void testPlayer() throws Exception {
        Player expectedPlayer = factory.generateRandomPlayer();
        PlayerRepository mockRepository = mock(PlayerRepository.class);
        when(mockRepository.findOne(expectedPlayer.getFirstName())).thenReturn(expectedPlayer);
        PlayerController controller = new PlayerController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/players/"+expectedPlayer.getFirstName()))
                .andExpect(view().name("player"))
                .andExpect(model().attributeExists("player"))
                .andExpect(model().attribute("player", expectedPlayer));
    }


    //http://localhost:8080/show?player_id=Reyder%20Risco
    @Test
    public void testShowPlayer() throws Exception {
        Player expectedPlayer = factory.generateRandomPlayer();
        PlayerRepository mockRepository = mock(PlayerRepository.class);
        when(mockRepository.findOne(expectedPlayer.getFirstName())).thenReturn(expectedPlayer);
        PlayerController controller = new PlayerController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/players/show?player_id="+expectedPlayer.getFirstName()))
                .andExpect(view().name("player"))
                .andExpect(model().attributeExists("player"))
                .andExpect(model().attribute("player", expectedPlayer));
    }*/

}
