package com.example.MavenProject.Repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import com.example.MavenProject.Model.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher,Long> {

    Teacher findTeacherById(Long id);
}
