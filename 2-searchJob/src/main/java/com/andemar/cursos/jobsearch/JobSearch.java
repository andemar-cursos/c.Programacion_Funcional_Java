package com.andemar.cursos.jobsearch;

import com.andemar.cursos.jobsearch.api.ApiJobs;
import com.andemar.cursos.jobsearch.cli.CLIArguments;
import com.andemar.cursos.jobsearch.cli.CLIFunctions;
import com.andemar.cursos.jobsearch.models.JobPosition;
import static com.andemar.cursos.jobsearch.utils.APIFunctions.buildAPI;
import com.beust.jcommander.JCommander;

import static com.andemar.cursos.jobsearch.utils.CommanderFunctions.parseArguments;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.andemar.cursos.jobsearch.utils.CommanderFunctions.buildCommanderWithName;

public class JobSearch {

    public static void main(String[] args) {

        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI =
                parseArguments(jCommander, args, JCommander::usage)
                .orElse(Collections.emptyList()).stream()
                .map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> cliArgumentsOptional = streamOfCLI
                                            .filter(cli -> !cli.isHelp())
                                            .filter(cli -> cli.getKeyword() != null)
                                            .findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(JobSearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }

    private static Stream<JobPosition> executeRequest(Map<String, Object> params) {
        ApiJobs api = buildAPI(ApiJobs.class, "https://jobs.github.com");

        return Stream.of(params)
                .map(api::jobs)
                .flatMap(Collection::stream);
    }
}
