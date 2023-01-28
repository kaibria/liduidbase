package ch.bbw.m151.liquibasedemo ;
import ch.bbw.m151.liquibasedemo.models.ArticleEntity;
import org.assertj.core.api.WithAssertions ;
import org.junit.jupiter.api.Test ;
import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.boot.test.context.SpringBootTest ;
import org.springframework.test.context.ActiveProfiles ;


@ActiveProfiles ( "test" )
@SpringBootTest ( properties = "spring.liquibase.drop-first=true" )
class LiquibaseDemoApplicationTests implements WithAssertions {
	@Autowired
	ArticleRepository articleRepository;
	@Test
	void setupAndTestDatabase () {
		var article = new ArticleEntity();
		article.setTitle ( "a title" ) ;
		article.setText ( "some text" );
		article = articleRepository.saveAndFlush(article);
		assertThat ( article.getId()).isNotNull();
	}

}