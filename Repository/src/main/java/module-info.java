module Repository {
    requires transitive Entity;
    provides com.education.module.repository.UserRepository
            with com.education.module.repository.impl.UserRepositoryImpl;
    exports com.education.module.repository;
}
