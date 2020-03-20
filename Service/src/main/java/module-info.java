module Service {
    requires transitive Entity;
    requires Repository;
    uses com.education.module.repository.UserRepository;
    provides com.education.module.service.UserService
            with com.education.module.service.impl.UserServiceImpl;
    exports com.education.module.service;
}
