package com.cx.restclient.ast.dto.sca.report;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SummaryResults {
    int highVulnerabilityCount = 0;
    int mediumVulnerabilityCount = 0;
    int lowVulnerabilityCount = 0;
}
