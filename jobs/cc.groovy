import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtLibraryJobBuilder

import static uk.gov.hmrc.jenkinsjobbuilders.domain.variables.JdkEnvironmentVariable.jdk7EnvironmentVariable


new SbtLibraryJobBuilder('car-tax-calculator', jdk7EnvironmentVariable()).
        build(this as DslFactory)
