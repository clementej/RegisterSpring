package soccer.test;

import soccer.config.FactoryClass;

//import ca.soccer.data.TrainerRepository;

public class TrainerControllerTest {
    FactoryClass factory=new FactoryClass();


  /*  @Test
    public void testTrainer() throws Exception {
        Trainer expectedTrainer = factory.generateRandomTrainer();
        TrainerRepository mockRepository = mock(TrainerRepository.class);
        when(mockRepository.findOne(expectedTrainer.getFirstName())).thenReturn(expectedTrainer);
        TrainerController controller = new TrainerController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/trainers/"+expectedTrainer.getFirstName()))
                .andExpect(view().name("trainer"))
                .andExpect(model().attributeExists("trainer"))
                .andExpect(model().attribute("trainer", expectedTrainer));
    }


    @Test
    public void testShowTrainer() throws Exception {
        Trainer expectedTrainer = factory.generateRandomTrainer();
        TrainerRepository mockRepository = mock(TrainerRepository.class);
        when(mockRepository.findOne(expectedTrainer.getFirstName())).thenReturn(expectedTrainer);
        TrainerController controller = new TrainerController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/trainerDetails/show?trainer_id="+expectedTrainer.getFirstName()))
                .andExpect(view().name("trainer"))
                .andExpect(model().attributeExists("trainer"))
                .andExpect(model().attribute("trainer", expectedTrainer));
    }*/

}
