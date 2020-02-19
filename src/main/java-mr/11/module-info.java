module no.ssb.dapla.dataset.api {
    requires com.google.common;
    requires io.grpc;
    requires grpc.stub;
    requires com.google.protobuf;
    requires grpc.protobuf;
    requires java.annotation;

    exports no.ssb.dapla.dataset.api;
    opens no.ssb.dapla.dataset.api;
}