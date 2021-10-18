package com.example.projekts;

import com.example.projekts.Lietotaji.Lietotaji;
import com.example.projekts.Lietotaji.LietotajiRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class lietotajiReopositoryTests {
    @Autowired private LietotajiRepository repo;
    @Test
    public void testAddNew() {
        Lietotaji lietotaji = new Lietotaji();
        lietotaji.setEpasts("roddy.bez richh");
        lietotaji.setParole("112");
        lietotaji.setVards("Janis");
        lietotaji.setUzvards("Pride");

        Lietotaji saveLietotaji = repo.save()
    }
}
