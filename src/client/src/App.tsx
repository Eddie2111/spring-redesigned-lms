import Axios from "axios";
import { useQuery } from "@tanstack/react-query";

const Page = () => {
    const { data, isLoading, isError } = useQuery({
        queryKey: ["todos"],
        queryFn: async () => {
            try {
                const response = await Axios.get<{ message: string; status: string }>("http://localhost:8080/example");
                return response;
            } catch (err) {
                console.log(error);
            }
        },
    });
    console.log(data, isLoading, isError);
    return <div></div>;
};
export default Page;
