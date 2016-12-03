package io.cattle.platform.allocator.lock;

import io.cattle.platform.allocator.service.AllocationRequest;
import io.cattle.platform.lock.definition.AbstractLockDefinition;

public class AllocateResourceLock extends AbstractLockDefinition {

    public AllocateResourceLock(Long resourceId) {
        super("ALLOCATE.RESOURCE.INSTANCE." + resourceId);
    }

    public AllocateResourceLock(AllocationRequest request) {
        this(request.getResourceId());
    }

}
