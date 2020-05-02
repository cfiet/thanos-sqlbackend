package net.cfiet.thanos.sqlbackend

import io.thanos.protobuf.store.Rpc
import io.thanos.protobuf.store.StoreGrpc
import org.lognet.springboot.grpc.GRpcService
import io.grpc.stub.StreamObserver

@GRpcService
class SqlThanosStore : StoreGrpc.StoreImplBase() {
    override fun info(request: Rpc.InfoRequest?, responseObserver: StreamObserver<Rpc.InfoResponse>?) {
        super.info(request, responseObserver)
    }

    override fun labelNames(request: Rpc.LabelNamesRequest?, responseObserver: StreamObserver<Rpc.LabelNamesResponse>?) {
        super.labelNames(request, responseObserver)
    }

    override fun labelValues(request: Rpc.LabelValuesRequest?, responseObserver: StreamObserver<Rpc.LabelValuesResponse>?) {
        super.labelValues(request, responseObserver)
    }

    override fun series(request: Rpc.SeriesRequest?, responseObserver: StreamObserver<Rpc.SeriesResponse>?) {
        super.series(request, responseObserver)
    }
}
