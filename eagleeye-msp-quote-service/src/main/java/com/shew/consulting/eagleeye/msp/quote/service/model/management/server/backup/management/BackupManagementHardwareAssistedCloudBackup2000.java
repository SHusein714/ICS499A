package com.shew.consulting.eagleeye.msp.quote.service.model.management.server.backup.management;

import com.shew.consulting.eagleeye.msp.quote.service.model.quote.ManagementType;
import com.shew.consulting.eagleeye.msp.quote.service.model.services.Service;
import com.shew.consulting.eagleeye.msp.quote.service.model.services.ServiceDefinition;
import org.springframework.stereotype.Component;

@Component
public class BackupManagementHardwareAssistedCloudBackup2000 implements ServiceDefinition {

    public static final String TITLE = "2000GB";

    @Override
    public Service defineService() {
        return new Service(getId(ManagementType.SERVER), TITLE, 499.99);
    }

}
