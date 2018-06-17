
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import util.BeforeSuite;
import util.DataToFeature;

@CucumberOptions(features = "src/test/resources/features/eribankExitoso.feature", tags = "@TestCase2", snippets = SnippetType.CAMELCASE, plugin = {
		"json:target/cucumber_json/cucumber.json" })

@RunWith(RunnerPersonalizado.class)
public class AlternoRunner {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
		DataToFeature.overrideFeatureFiles("./src/test/resources/features/");
	}
}
