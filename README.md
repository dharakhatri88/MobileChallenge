#Mobile App Developer Coding Challenge

## Goal:

#### Develop a currency conversion app that allows a user to convert an input value by any of the supplied rates.

- [ ] Android: _Java/Kotlin_ | iOS: _Swift_
- [ ] exchange rates must be fetched from: http://fixer.io/  
- [ ] rates should be persisted locally and refresed no more frequently than every 30 minutes
- [ ] user must be able to select the input currency from the list of supplied values
- [ ] UI Suggestion: Input field with a drop-down currency selector, and a list/grid of converted values below.

<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAARIAAAHtCAYAAADV8/HvAAAFFnpUWHRteEdyYXBoTW9kZWwAAE1Vx66rWBb9GktVg74imTAkg4kmGTxpkXPOfH0d6r6WeoBOWGunswMPlG2PrGzSBwIt55A+UO6BIHnf5/cVAm7XOZ3oPO2WX0jrr7JpwgciPH8gAP/lw/ADZcBOLbv1AOtB4v/Fsb/Bjh6GJv2kkVIuNx8lflD8FlEkR1MfCAv2TVnfpsU0rvtbhC2mvk1vNvYD/SAkBv1Qtxk7zMKp/D8tt2tbOs1l3/06hgM+/IP+ImlSLv30C+z7/pNM4f5T9jeI8g+UTcown8IWMLuw/RO0Gebpf+BfCuENSYRrmGBCsMlFrPHidoOzr/ncdLsEnzI/EMZY6fe4h9fRdg44Zt4kPrc9CMOqqQ9RbAsBS6YAqBTSOIWODZslAtvOF/CDmTCdnHfqLQPUQJf9uXuMRNsgdGb7XA0ZvPcpP56vo67eTcwJgCbryKltk5jacjT5dcaIzKfGi8XxhgATHCjChp2iiDkRDdT8jFJ8GUXGCZRtmWKPEGTNk5m45kh5vyNsOqZSdVbDfzuYaDii7V6woj1Jf5c14ES7BiwSSdpmutY3PZ8BJmemX5miZeqeLwLGAdsC3Ee6WSbppJCpI+Nlb8riyW8JMKBl/A5YjCQN4YQRuYumbXtUWm+eAj6vuhDsaaYxCX9swYW0Js7h60tWTtfx55Zht3pRI46BhhO2meAVIjBmnAcXUaezh5Pbap8nfB5R7QWb01qe79WD8+4YSB3M0NBwpFlQA6a7b+R61/2magLx9tVK14E4bOx2F93fKZS3OWj6Rb+fhAKVw8RqHij6bEHEU2gi+VLqK1ktFRd94YzwqHznlWiQbMojeVWEIEIBSYZP77cnW8YzVssQSeUKqG7B6Ye19M525TWdKaiaw59U9Noa70MAO3grIZlYWs46HpPv0/SZ5lw2eyLTjtWVXzoZ6r49Fbu6m/CXFhl3zhzKU9aQMlnn7qdihySvHw0zeUlfKFQ48gVpRM/r7WSz46e+QFELE7ygeLC146mORH7i5RJofvmysuGzKRyj4bZsIbVnfN2Bnl2Yj7/uFPV6SMnwMQaZxgvO0FcvfYtLSS5KYkqkTqTen5aP52R1mFemcoMG2p7hY96hRPn8ckicA8vzlyGf4H428XLk57fUsLPUFm+ooisIS18Kcsl5qFGryHTG1MA7Amm7lIP6sOqK1eTJZlJaQzhcb5unchgaY9RRvYQT0OEdPtDcnGN8wCp/p3fUrbtqrVo0A1S+uLRyVelbWGlwkiy++28Km2dKIgtL0wTIjytxu1Pu9jiOFrFv6WS3Ltte9JxBfiJo3TWcX5BInoaEf8FZche8Eqp7bkxZv6+luOL3UGPsk77KEl8g11XlylCnEbUSy1o8bOyhpaGY0YP8z50IOpoV+ESnPIiTyH0qo15h06ZoNBhvghB+jee4iis8VlOQm/s6zViFQrCG+b0rD57abiOGwymKLwc+AAn0/JoYRfFUXugdgqUxeyRWtyVv0FR2xIWu9NVwuk2IrxBA0VAOzDusOe7YF1hrKZgWa572QACLzohq1mmpRn9WyaO/fhDvZiPVsUhFtTlWjoHU9/DpPi+Ifgc1qgYNSdByoIz2RI72C1mfDGeoCYfeVYkXI47o291bF5U05lbeXQVlFcC4b8xaekpDsGu3vEZLBZZmPVWjbwIy5SO14cgPSSiKGz/1J8zt9Rn3iZOWgCwpgbEN1v9N7n/HODj/+Xuh/D/BX+lIAAAgAElEQVR4Xu2dC9BVVfn/FxcRUUQxLioiXkAdIZBXfL3rOFlU1jRNF/tPaVZDNU2mOWqXccqxJrtYdnFKxxlzsoYmHa1+FZPdRNQMX4RAURBFRBQIFAVFBN//PAvOed/3cM7Z67b3WWvvz55hEM+6POvzPOu711577bUG9fb29iouCEAAAh4EBoUUkrfeeku9/PLL6pVXXlHbtm1Tr7/+utqxY4fauXOnQq88vERWCDgQGDRokBo6dKgaNmyY2m+//dT++++vDjzwQHXQQQepwYMHO5TYOksQIVm/fr3auHGj2rRpkzZy1KhR2mgxft9999WNkUZxQQACxRGQm7fcxN944w19U5eb+5YtW/TN/pBDDlFjxoxR48aNC2KQs5CIgWvXrlXr1q3TKjd27Fht3JAhQ4IYRiEQgEA+BHbt2qVv+hs2bNBPD4cddpiaMGGCvuG7Xk5CIgLy7LPPakUTA0aMGOFaP/kgAIEOEnjttdf0gECeKI488kjdn10uKyHZunWreuqpp7RyTZo0SR1wwAEudZIHAhCIjID07dWrV+tHoWOPPda6bxsLyYsvvqiefPJJNXnyZD0U4oIABMpHQKYqVq5cqY477jg1fvx44wYaCYkolQx9jj/+eDVy5EjjwkkIAQikR+DVV19VTzzxhJ66kCcPkytTSJ5++mk9IXPiiSeqffbZx6RM0kAAAokTePPNN9Vjjz2mX6QcffTRma1pKyQyEpFXRdOmTeNtTCZKEkCgXATk7c7SpUv1ko6skUlLIZE5keeee07NmDGDkUi54oPWQMCYgIxMFi9erI444oi2cyZNhURmcHt6etTMmTOZEzFGTkIIlJOAzJksWrRIdXV1tXyb01RIRIFkgRlvZ8oZGLQKArYE5G2OLGCTJ5Rm115CIotTZF5k6tSptnWRHgIQKDGBZcuW6fmSZovWBgiJLEZ5+OGH1fTp060XpJSYH02DAASUUjLlsWTJEtXd3b3XcvoBQiJvaeRr3SlTpgAOAhCAwF4EVqxYob8mbnyLM0BIHnzwQf0MxLczRBAEINCMgHybI3Oop59++oCf60JS2wqAuRECCAIQaEdA5koatyCoC4n8KG9q5A8XBCAAgVYE5O2N/Ok/6NBCIjub3X///erMM89kBSvxAwEItCUgK14XLFigzjrrrPpOa1pINm/erFexytsaLggIAVkGIKubZWWjfGMlX4K67lUB0fIRkLc3stp19OjRunFaSORtjVxZ6+nLh4MWNSMg20XI1piy0Y1slSlb9clGVrJ1n3xezgWBRs3QQiJf+cnciEygcFWbgOzpKUHSbHQqdyG52cievFzVJiDbisg8iewKUB+RPPLII3qvEXY8q3ZwSOvlcUZe8TX7dFy2lJClATYb3kC0nARkcZrsWXLyySf3CYmsH5k1axZf+ZbT51atYkRihauyiWXubOHChfX1JPrRZv78+XoGliMjKhsXAxrOHAlxkEVA5svkTe/ZZ5/dNyK577771DnnnJOVl98rRIC3NhVytmNT++uGHpEgJI4kyQaBChNASCrsfJoOgVAEEJJQJCkHAhUmgJBU2Pk0HQKhCCAkoUhSDgQqTAAhqbDzaToEQhFASEKRpBwIVJgAQlJh59N0CIQigJCEIkk5EKgwAYQkMedv2rRJvfTSS/pjOlmaXPZLPtWQjwMPPvhgdcghh5S9ucm2DyFJxHVyeLssVRcBkS9u5UBn2c2u7NfgwYP1wfXyJbIIimyoJG3niosAQhKXP1pa88ADD+itHaq8c53sgSKfrJ9xxhmJeK06ZiIkCfhatr6Unf1r+z0kYHJuJsp+OePGjdNb+3HFQwAhiccXLS2RPWJkjuCEE05IwNp8TVy+fLmeI2o8SyXfWik9iwBCkkUogt/lsUY21kVIlHr88ce1kPB4E0Fg9jMBIYnLH02tWbp0qd5oigPLlJIzl+Rt1bRp0xLwXHVMREgS8PW6devUqlWr9NxAlc9ilt3aZJNh2UP28MMPT8Bz1TERIUnE1y+88EJdTORoCDm8uSqXHGYvR2DIhLOIyGGHHVaVpifTToQkGVcpJZsx/+9//1OyKE3Ol5E1FmW/ZK2MnKcji9HkiBTWkMTpcYQkTr9kWiVCMmTIkMx0qSeQIyFFSLjiJoCQxO0frINAEgQQkiTchJEQiJsAQhK3f7AOAkkQQEiScBNGQiBuAghJ3P7BOggkQQAhScJNGAmBuAkgJHH7B+sgkAQBhCQJN2EkBOImgJDE7R+sg0ASBBCSJNyEkRCImwBCErd/sA4CSRBASJJwE0ZCIG4CCEnc/sE6CCRBACFJwk0YCYG4CSAkcfsH6yCQBAGEJAk3YSQE4iaAkMTtH6yDQBIEEJIk3ISREIibAEISt3+wDgJJEEBIknATRkIgbgIISdz+wToIJEEAIUnCTRgJgbgJICRx+wfrIJAEAYQkCTdhJATiJhBcSLZv365efPHFuFuNdRCAwAAC48ePV8OHD3emkouQLFmyRB94zQUBCMRPQM5Unj59epxC0t3dHT9BLIQABNTDDz+MkBAHEICAHwGExI8fuSEAAaUYkRAFEIiVwC9+8Qt10UUXqREjRsRqYt0uRiQFumjz5s3qX//6l1q8eLFau3atmjBhgpoxY4Y699xz1ejRowu0hKpSIHDMMcfoFw5XXXWV+sAHPhC1yQhJQe657bbb1I033qi2bt26V40HHHCAuuyyy9Qll1xSkDVUkwIBEZI77rhDff/7368LylFHHeVs+o9//GPnvJLxS1/6Usv8CIkXWrPM1113nQ6IXbt2qdmzZ+tRyMiRI9Wrr76qRyfz5s1TQ4YM0cPYr3/962aFkqp0BEQ4rrzySvW5z31Ot03+vWrVKv3fcpOZP39+/d8ujZfyLr30Upes6ic/+UnbuhESJ6zmmRYsWKCuuOIKNWjQIHXNNdeoMWPGqHvvvVc98cQT6vjjj1fnn3++2rhxoxKx6e3tVTfccIM688wzzSsgZWkIPPPMM+p73/uekjUZIigf//jHg45IakIiomBzifhIHvm71agkSSH5xje+oQEL6GuvvVb5/tsGqkvaFStWaDVfuHChuv322/cq4uKLL1azZs3Sd6ApU6a4VEGeEhG455571He/+121YcMGNXbsWHX11VcHmSPxERLBK2Iha7uaiUmSQiJAapd0UN9/FxGD//jHP9RXvvIVtWXLFvWFL3xBHXrooeqFF15QN910kxo1apS6/vrr1XnnnVeEKdQROQGERKlBvb29vf3XzLv4TL61kSXyrVa2+o5AGvO72OiSZ/Xq1erf//63uvDCC+vZ586dq0499VQ1adIklyLJUyICPNrcp8455xzt0UKEJPXYkaHqnXfeqT70oQ/pISwXBIQAk60IiVVPaHwUs8pM4soQ4PXvfX3K4uL1rEcblzJjysOIJCZvxGsLC9IQknijE8uSIcASeYQkmWDFUAiEIJDk698QDacMCEAgHAGEJBxLSoJAZQkgJJV1PQ2HQDgCCEk4lpQEgcoSQEgq63oaDoFwBBCScCwpCQKVJYCQVNb1NBwC4QggJOFYUhIEKksAIams62k4BMIRQEjCsaQkCFSWQCmE5LOf/WxlHUjDIZAHgZtvvtmq2NIIiW3DrSiRGAIVIiA3Ztv+hJBUKEBoKgRMCCAkJpRIAwEItCWAkBAgEICANwGExBshBUAAAggJMQABCHgTQEi8EVIABCCAkBADEICANwGExBshBUAAAggJMQABCHgTQEi8EVIABCCAkFQoBt544w117rnnqoceeki3+sorr1Tvete71Dve8Q5jCn//+9/Vn//8Z3XDDTfoPKeffrqS/7fffvu1LEPOZv3jH/+oDjzwQPWnP/1J1/+tb32rZXqXOhoLs63Thc0111yjTjnlFPW+971Pbd26Vb33ve9Vcoa1z2VrdwhWPvbW8iIkISgmUoZ823DbbbcpOURJrvPOO0/dfffdatSoUcYtkHOHjzzySH2o+Y4dO7QwPfjggy3zv/XWW7qzPfLIIzrNtddeq0466ST1/ve/v2Ue2zoaC3Kp04XNu9/9bs1z/PjxWkB+//vfqx/+8IfGLEPY7cvK2diGjAhJKJIJlPOzn/1Mjxw+/elPK+lsp556qvrPf/5jZXntEHM5GlLE4dZbb60LU7OCli1bpg89/9WvfqV/vuCCC3Qe6XytLts6GstxqdOFjQjio48+qqv/wQ9+oCZMmKAF1vVysduXlautjfkQklAkIy7nxhtvVHPnzlWrVq1Shx56qBoxYoR6/fXX1bp16/Rp9j/96U/VrFmz2rbgoosuUitWrFBLly5V06ZN02nXr1+vBg8erMaMGaMeeOABNWTIkHoZ8+fPV1dddZXauHGj2rVrV104pLNMnTpVXXLJJapxKwfbOhoNdqnTlo08wsijoDwKPfvss2rKlCnajJUrV6qJEyfq0ZftV7AudvuyCh2uCEloohGXJ3dQGUVIh//5z3+u/54zZ46xxdJxvvjFL6o//OEPOs9HP/pRdd1119U7U7OCPvnJT6pLL71UzZw5Uy1fvlyn/81vftOyTpc6GguzrVPy27L55S9/qTZv3qy+/OUv6+qlfYsWLTJmGQsrL4P7ZUZIQpGMvJzVq1eryy67TN1zzz3aUhkSX3/99erYY481tlzmA7Zs2aLL6e3tVV1dXZmdRzpoT0+PHrnI48Pw4cPVZz7zmZZ1utTRWJhtnS5sLr74YnX55ZerGTNmKBllCcs77rjDmGWzhLZ2h2DlZTBCovSw2nYIGgp60eWcf/756plnnlE7d+6sP2LUHlHGjh1bH2G0skuG7Z/4xCfU008/rfPXHo2ef/55LUSzZ89W3/zmNwdkv/rqq9W9996rpJP2H/4fccQRWkzuvPNOPadQu1zqaLTXtk7Jb8vmt7/9rfrRj36kxePEE09UgwYN0o948rew/NrXvtZ2IrkZY1u7Q7AKHYMu/YmNjUJ7oYDyPv/5zyt5rj7ttNN055ZHFHkla3OdfPLJSpwvj0QytN+0aZO64oorWhYhnU7E56tf/apOM336dLV48WLd6VpdtnU0luNSpy2bDRs2aJbz5s3T1cujlPCUEZrr5WK3LytXW5vlQ0hC0oy4rDPOOEOPEGQ0cdddd6nHH39cyToI02vbtm16zcmCBQt0Fuk4H/nIR9RZZ53Vsgi508orZsknoiNzKn/7299apnepo9moxKZOyW/L5i9/+YuSCdLvfOc7unqZqJZX4Pvss0/Ltt1+++16crsmqr52h2Bl6nuTdAiJCaXE08hbE3nVu3DhQt0SGX7Lwifp4KaXvJWRSdKbbrpJZzn77LP1HVmEqdX1zne+U/3617/Wb3X++te/qn/+85/1ztcsj0sdjeXY1unC5tvf/rZ+XPvwhz+s335Jnffff39blDJqkceh2noaX7tDsDL1vUk6hMSEEmkgAIG2BBASAgQCEPAmgJB4I6QACEAAISEGIAABbwIIiTdCCoAABBASYgACEPAmgJB4I6QACEAAISEGIAABbwKVFhJvehQAAQjUCdh+u1aKb23wPwQg0FkCCEln+VM7BEpBACEphRtpBAQ6SwAh6Sx/aodAKQggJKVwYzUa0bgvbDVa3blW2ky4IiSd8xM1WxJweS1pWQXJ9xCwZY2QEDrJELAN7mQaFqGhtqwRkgidiEnNCdgGNxzdCdiyRkjcWZOzYAK2wV2weaWqzpY1QlIq95e7MbbBXW4a+bbOljVCkq8/KD0gAdvgDlh15YqyZY2QVC5E0m2wbXCn29LOW27LGiHpvM+wwJCAbXAbFkuyJgRsWSMkhFEyBGyDO5mGRWioLWuEJEInYlJzArbBncXxd7/7nfrYxz6mD8Q65ZRTBiSXM467u7vV3Llz9dnIIdPJWc2xX7asEZLYPYp9dQK2wW2C7sILL1RydvKiRYvUvvvuq7O8+eabSo7QlPOA5SAxuUKnM7Gtk2lsWSMknfQWdVsRsA1uk8Ll+NGpU6eqT33qU0pO3ZNLDlG/5ZZb9Gl6o0eP1v8vdDoT20zSDLp2i/q//7e/eu/koZnJ/7Ryp7rgN9tU7zdGZaa1ZY2QZCIlQSwEbIPb1G45gP2DH/ygPlRdzvyV0cjdd9+t3vOe9wwoInQ6U/vapauJQ5aYmKar1WXLGiEJ4U3KKISAbXDbGCXn+T766KNq2LBhavr06erWW29tmj10OhsbW6XNEoms35uVa8saIQnhScoohIBtcNsYtWXLFj0nMnjwYPXYY4+pkSNHNs0eOp2NjS4jExcRkXpsWSMkoTxJObkTsA1uW4MuuOACNXToUHXPPfe0zRo6na2dpiMTVxFBSEJ5hHKiJICQZLulJh7fOGe4uva+7cYTsY0l27JmRJLtG1JEQsA2uG3NDj3SMC3P1s6s9D4jkVrZtqwRkiyv8Hs0BGyD29Zw044fOp2tnUWkt2WNkBThFeoIQsA2uINUWtFCbFkjJBUNlBSbbRvcKbYxFpttWSMksXgOOzIJ2AZ3ZoEkaEnAljVCQjAlQ8A2uJNpWISG2rJGSCJ0IiY1J2Ab3HB0J2DLGiFxZ03OggnYBnfB5pWqOlvWCEmp3F/uxtgGd7lp5Ns6W9YISb7+oPSABGyDO2DVlSvKljVCUrkQSbfBtsGdbks7b7kta4Sk8z7DAkMCtsFtWCzJmhCwZY2QEEbJEJDg5iqOwM0332xcGUJijIqEEIBAKwIICbEBAQh4E0BIvBFSAAQggJAQAxCAgDcBhMQbIQVAAAIICTEAAQh4E0BIvBFSAAQggJAQAxCAgDcBhMQbIQVAAAIICTEAAQh4E0BIvBFSAAQggJAQAxCAgDcBhMQbIQVAAAIICTEAAQh4E0BIvBFSAAQggJAQAxCAgDcBhMQbIQVAAAIICTEAAQh4E0BIvBFSAAQggJAQAxCAgDcBhMQbIQVAAAIICTEAAQh4E0BIvBFSAAQggJAQAxCAgDcBhMQbIQVAAAIICTEAAQh4Eyi9kNxyyy3ekGIpYM6cObmaAitzvLAayKoyQjJ79mw1ceJE80iJJOWaNWvUvHnztDVFCQmssp1fExJY7WZVCSERZ0tnTM3pNRGp2V+EkMAqW0QkhQgJrPpYVUJIpAP275QpjEwa7ZXALUJIYGUuJLCqoJBIk1MRk2Z2FikksMoWk/7+IK4q8mjT/04eu9Nb2Ve0kKQgJrDKFrxairxZVebRpj/yWMWknV2dEJKYxQRW/iJSm+sJ8chcSSGJsYNkiVunhARWzTtsK39k+dG8+4dJmWVPqLiqrJDE1EGynB3yztEuPNsFlYmNYUK/fSkmdoTqHLAy92ilhSQGMTHpGDEICawGdqossTL1q3lXtUtpWn9WO0xrrbyQdLKDmDo7FiGBVV+3MumANv417bAm6WzqNWmHSZ0IyR5KNvBNwGalsa0vlMNdh+v989nansUi63fb+mBlvvgyFCuEpF8U2wZsVgdo9btLPaEcHkJIihyZwMo8yjrJCiFp8JOLM8xd7b4oLjYhKUJMXH0BK/NvykKxQkiaqIBrAGcJik+5oRweakRSK8enTe1s8SkXVlmRaDfXY1IaQtKCkk8gNyvSt7xYO0ceIxNYmXTd3WliYYWQtPGZr5NC3rVjFpIQAQ0rc/GIkRVCkuE/XzHxzV8zL3YhCSEmsDIXk9hYISQGvnN1mmu+ZialICQ+YgIr8wnSGFkhJAZC4tJBQjpb6k9FSGBlGFB7ktnGiW36LGtCxRVCkkW63++mTjRNZ1F1UkJiIyawMp8wjZkVQmLTmw1myfNwdmojEtPJQFj1BV8Wi6zfLcO4npwRiSG5UKD6V9fKqXk5O1UhaTcygdXeAZxyXDEiMRSkxmSNTs+zY6QsJM3EBFatgy7VuEJIHIWkfwfp6upSPT09ue5Sn8fIqrHpedZR6yCwyg64FFkhJNl+bZtCBET+SAeRP3ldeXbyms151wEr8+hIjRVCYu7bvVKmeOdo19w8hQRW5oGWIiuExNy/A1Km+izbCSGBlXmQpcoKITH3cT1lyrPrRQsJrMwDLGVWCIm5n3XKrDcOWb9bVldPnudjR15zJFkssn6HVR+B2FkhJBbRaupM03QWVbOy1QJWaqJrGi+m6SxQBYsrhMSQuq0TbdNnmZFS57Btu216WJnvyVoUK4Qki7TB40yrIkJ2kFSExLXNrvmasYeVQVDvSRKKFUKSwdw3wH3z5zV/kUcH9G2rb35YmQtIaFYISRv2oQI7RDmh7hx5vbUJ0UaTyWyTrgIrE0q704RihZC0YB6qY9SK9y0vlMPzEBLftjXa5FserBASTWD79u1qyZIlqru725xIi5QuQeUbyHnMmbi0wxaeSx2wMqdcZlaMSBriIC9n+45MXDq5eYi7DXNhNccYcdlZIST9QiFvZ/uISWxCAqtb1Jw5ZkJSBVYIyZ7eXZSzXcUkJiGBlfkkZVVYISQe60SMx7UBJnRjEZKiO4aL8MJqjZo3z2zRWihWlReSTnUM2w4SyuE+b21g1Ucvyx9VY1VpIem0s23EJCtwfUdHWWsKYDWQcDt/VJFVZYUkFmebikknhQRWe8t0K39UlVUlhSQ2Z5uISaeEBFbNx3rN/FFlVpUTklidnSUmnRASWLV+YGz0R9VZVUpIYnd2OzEpWkhg1X7Wqb8/YKVUZYQkFWe3EpMihQRW2VPXNX/AajerSgjJ7Nmzjd+rZ4dQcSn6B6msCzBdSelqoXQOWJnRg9VATpUQEmmydJCJEyeaRUlEqWpiIiYVISSwMnO+CAms+lhVRkjMwiPuVEUJSdwUzKyDlRmnUDeo0guJOU5SQgACrgQQEldy5IMABOoEEBKCAQIQ8CaAkHgjpAAIQAAhIQYgAAFvAgiJN0IKgAAEEBJiAAIQ8CaAkHgjpAAIQAAhIQYgAAFvAgiJN0IKgAAEEBJiAAIQ8CaAkHgjpAAIQAAhIQYgAAFvAgiJN0IKgAAEEBJiAAIQ8CaAkHgjpAAIQAAhIQYgAAFvAgiJN0IKgAAEEBJiAAIQ8CaAkHgjpAAIQAAhIQYgAAFvAgiJN0IKgAAEEBJiAAIQ8CaAkHgjpAAIQKD0QlI7Ea0MrubQJ3MvwqpYVpUREo7szA4sjqHMZlRLAauBrCohJByMbdZBOBjbjJOkglUFhUSGubXDuFMZmTTaK4FbxHAdVmZiUvMHcbWbVyVGJLUOmIrTm9lZpJBIYMCqvaD09wesKiYkKXSQVkFZtJDAylxIYFVBIYnZ6e3ubJ0QEli1FpNm/oh1ZFJEXFXq0aZ/WMTm9Cx7OiUkMYoJrMzmcUx8FyquKiskJpDN3eWXMqtj1N4SFDXZ2qw1Jjb6UTDLbWJHqM7RzqJ2dZjYaNZav1QmdoRiVWkhiUFMTJwdg5DAamCnzuqApn71k4rWuU3rz2qHqX2VF5JOdhBTZ8ciJLDq61YmHdDGv6Yd1iSdTb0m7TCpEyHZQ8kGvgnYrDS29YVyuOtwvZPzS7DKiqa+3zvFCiHp5yNbJ5i7d2BKl3piEpIiRyawMo+yTrJCSBr85OIMc1e7L/SKTUiKEBNXX8BqonFIhmKFkDRB7hrAWd7zKTeUw0M82hTxmAOrrGhyf5zpX3KouEJIWvjLJ5CbFelbXiiHhxaSPEYmsCpGRKSWUHGFkLTxmW9A14oOUU4oh+chJCHFBFbFiQhCYs7aW3F9A9s3f62psQtJCDGBlXlgx8aKEYmB71yd5pqvmUkpCImPmMDKfII0RlYIiYGQuHSQkM4OOQTN69HGZwIWVvOU6T45sbJCSAyFxEZMQjs7NSGBlUVQWez9EnNcISR2Ps/c8CcPZ6coJCZiAqu+4MtikfW7ZRjXk4d6ZEZIHDzQyql5OTtVIWknJrDaO/BSjiuExEFImnWQPDtGykICK7sAa4yjVOIKIbHz84DUNSd3dXWpnp4e4wkzlypDDUGLmGxtVgeszL2eIiuExNy/TVOKgMgfERP5k9eVupAIF1iZR0dqrBASc9/ulTLFOwcjEg+H98uap7CnGFcIiWNcpfos2wkhgZV5kKXKCiEx93E9Zcqz60ULCazMAyxlVgiJuZ91yqxZ9KzfLaurJ89zKF2rJHQdWSyyfodVH4HYWSEkFtFq6kzTdBZVe398aFJXSCExZWCazsT+vASxWd2wGkgFITGMUNuAt02fZUbIwG1VV6g6bNtumx5W5t/mFMUKIckibfA406qIkB0kVCfPe47Etc2u+fIeLeQpuq5tds2XJyuEJENIfJ3mmz+l4bpvW33zw8rgrtiQJNQNCiFpwz5UYIcoJ5TD8xqRhGijyWS2SVeBlQml3WlCsUJIWjAP1TFqxfuWF8rheQiJb9sabfItD1YIiSawfft2tWTJEtXd3W1OpEVKl6DyDeQ85kxc2mELz6UOWJlTLjMrRiQNcZCXs31HJi6d3DzE3Ya5sJpjjLjsrBCSfqGQt7N9xCQ2IYHVLWrOHDMhqQIrhGRP7y7K2a5iEpOQwMp8krIqrBASj3UixuPaABO6sQhJ0R3DRXhhtUbNm2e2aC0Uq8oLSac6hm0HCeVwn7c2sOqjl+WPqrGqtJB02tk2YpIVuL6jo6w1BbAaSLidP6rIqrJCEouzTcWkk0ICq71lupU/qsqqkkISm7NNxKRTQgKr5mO9Zv6oMqvKCUmszs4Sk04ICaxaPzA2+qPqrColJLE7u52YFC0ksGo/69TfH7BSqjJCkoqzW4lJkUICq+yp65o/YLWbVSWERA5oNn2vnh1CxaXoH6Riv+lKSlcLpXPAyowerAZyqoSQSJNNT3s3C6PiUtXERGosQkhgZeZbERJY9bGqjJCYhUfcqYoSkrgpmFkHKzNOoW5QpRcSc5ykhAAEXAkgJK7kyAcBCNQJICQEAwQg4E0AIfFGSAEQgABCQgxAAALeBBASb4QUAAEIICTEAAQg4E0AIfFGSAEQgABCQgxAAALeBBASb4QUAAEIIOwDMK4AABEaSURBVCTEAAQg4E0AIfFGSAEQgABCQgxAAALeBBASb4QUAAEIICTEAAQg4E0AIfFGSAEQgABCQgxAAALeBBASb4QUAAEIICTEAAQg4E0AIfFGSAEQgABCQgxAAALeBBASb4QUAAEIICTEAAQg4E0AIfFGSAEQgEDphaR2IloZXM2hT+ZehFWxrCojJBzZmR1YHEOZzaiWAlYDWVVCSDgY26yDcDC2GSdJBasKCokMc2uHcacyMmm0VwK3iOE6rMzEpOYP4mo3r0qMSGodMBWnN7OzSCGRwIBVe0Hp7w9YVUxIUuggrYKyaCGBlbmQwKqCQhKz09vd2TohJLBqLSbN/BHryKSIuKrUo03/sIjN6Vn2dEpIYhQTWJnN45j4LlRcVVZITCCbu8svZVbHqL0lKGqytVlrTGz0o2CW28SOUJ2jnUXt6jCx0ay1fqlM7AjFqtJCEoOYmDg7BiGB1cBOndUBTf3qJxWtc5vWn9UOU/sqLySd7CCmzo5FSGDV161MOqCNf007rEk6m3pN2mFSJ0Kyh5INfBOwWWls6wvlcNfheifnl2CVFU19v3eKFULSz0e2TjB378CULvXEJCRFjkxgZR5lnWSFkDT4ycUZ5q52X+gVm5AUISauvoDVROOQDMUKIWmC3DWAs7znU24oh4d4tCniMQdWWdHk/jjTv+RQcYWQtPCXTyA3K9K3vFAODy0keYxMYFWMiEgtoeIKIWnjM9+ArhUdopxQDs9DSEKKCayKExGExJy1t+L6BrZv/lpTYxeSEGICK/PAjo0VIxID37k6zTVfM5NSEBIfMYGV+QRpjKwQEgMhcekgIZ0dcgia16ONzwQsrOYp031yYmWFkBgKiY2YhHZ2akICK4ugstj7Jea4QkjsfJ654U8ezk5RSEzEBFZ9wZfFIut3yzCuJw/1yIyQOHiglVPzcnaqQtJOTGC1d+ClHFcIiYOQNOsgeXaMlIUEVnYB1hhHqcQVQmLn5wGpa07u6upSPT09xhNmLlWGGoIWMdnarA5YmXs9RVYIibl/m6YUAZE/IibyJ68rdSERLrAyj47UWCEk5r7dK2WKdw5GJB4O75c1T2FPMa4QEse4SvVZthNCAivzIEuVFUJi7uN6ypRn14sWEliZB1jKrBAScz/rlFmz6Fm/W1ZXT57nULpWSeg6slhk/Q6rPgKxs0JILKLV1Jmm6Syq9v740KSukEJiysA0nYn9eQlis7phNZAKQmIYobYBb5s+y4yQgduqrlB12LbdNj2szL/NKYoVQpJF2uBxplURITtIqE6e9xyJa5td8+U9WshTdF3b7JovT1YISYaQ+DrNN39Kw3Xftvrmh5XBXbEhSagbFELShn2owA5RTiiH5zUiCdFGk8lsk64CKxNKu9OEYoWQtGAeqmPUivctL5TD8xAS37Y12uRbHqwQEk1g+/btasmSJaq7u9ucSIuULkHlG8h5zJm4tMMWnksdsDKnXGZWjEga4iAvZ/uOTFw6uXmIuw1zYTXHGHHZWSEk/UIhb2f7iElsQgKrW9ScOWZCUgVWCMme3l2Us13FJCYhgZX5JGVVWCEkHutEjMe1ASZ0YxGSojuGi/DCao2aN89s0VooVpUXkk51DNsOEsrhPm9tYNVHL8sfVWNVaSHptLNtxCQrcH1HR1lrCmA1kHA7f1SRVWWFJBZnm4pJJ4UEVnvLdCt/VJVVJYUkNmebiEmnhARWzcd6zfxRZVaVE5JYnZ0lJp0QEli1fmBs9EfVWVVKSGJ3djsxKVpIYNV+1qm/P2ClVGWEJBVntxKTIoUEVtlT1zV/wGo3q0oIiRzQbPpePTuEikvRP0jFftOVlK4WSueAlRk9WA3kVAkhkSabnvZuFkbFpaqJidRYhJDAysy3IiSw6mNVGSExC4+4UxUlJHFTMLMOVmacQt2gSi8k5jhJCQEIuBJASFzJkQ8CEKgTQEgIBghAwJsAQuKNkAIgAAGEhBiAAAS8CSAk3ggpAAIQQEiIAQhAwJsAQuKNkAIgAIGohWTcuHF4CAIQSIDA+vXr1fTp09Xw4cOdrb3vvvvUOeeco/MP6u3t7e3/P1xKlXNtXnzxRZes5IEABDpEYPz48XEJSYc4UC0EINBBAsFHJB1sC1VDAAIdIoCQdAg81UKgTAQQkjJ5k7ZAoEMEEJIOgadaCJSJAEJSJm/SFgh0iABC0iHwVAuBMhFASMrkTdoCgQ4RQEg6BJ5qIVAmAghJmbxJWyDQIQIISYfAx17tG2+8oV5//XUlf7/55ptq165dqre3Vw0aNEgNGTJE7bPPPmrfffdV++23n/6bq9oEEJJq+7/e+q1bt6qXXnpJbdmyRb3yyitq8ODBdZEYNmyYFg8RERETEZUdO3ZokRGxeeutt9SBBx6oRo0apQ4++GB1wAEHQLViBBCSijm8f3PlA0v58nPDhg1aJEQEDjroIC0KMuIwvWTEIuLz8ssvazESsRk7dqySL8B9vig1rZ90nSeAkHTeB4VbIKOPtWvXqk2bNin56lM6fMhRhJQvAiVfgR9yyCFqwoQJQcsvHBgVZhJASDIRlSeBPI6sXr1abd68WXfuww8/XI9E8rpkZPL8889r0Ro9erSaNGmSksckrvIRQEjK59OmLZLRwapVq7R4HHnkkbkKSKMBIijPPvusFpVjjjlGj4K4ykUAISmXP5u25sknn9STotKJR44c2bEWv/rqq1rM5E3Pcccd1zE7qDg8AYQkPNNoSpS3KsuXL9fzE8cee2w0dj311FNK5lFOOOEEXh1H4xU/QxASP37R5pYRyLJly/RjxBFHHBGdnc8995yejJ06daoeoXClTQAhSdt/Ta2Xkch///tfPR9y2GGHRdvCdevW6XmTt7/97YxMovWSmWEIiRmnpFItXrxYv3aNcSTSCFJGJvIaesaMGUkxxtiBBBCSkkXEypUrdYsmT56cTMtStDkZuAUZipAUBLqIamSFqtzhu7q6iqguaB09PT16BCUrYrnSI4CQpOezphbLWg05Me3444/Xy9xTu2R5/RNPPKG6u7sLXeOSGqdY7UVIYvWMpV2y4EsmWadMmWKZU6mNGzfq1a7y8Z3vJR/7ySrWMWPGWBe1YsUKPekqC+a40iKAkKTlr6bWyte4Dz30kDr55JOtP5KTNR2yUExeE8sXvr6X2CKvdWXhm+3aFfmI8JFHHlGnnXZaEFt820J+cwIIiTmraFPKK1RZ4GW7WlQeJ2SiUwQo5Dc38pglgiCjI9lawOaSVbiygE5eXXOlQwAhScdXLS1dtGiROvroo63nRtasWaN27typ84a+nn76ab0Vge0raBE3yTtz5szQJlFejgQQkhzhFlG0rGCVxWcySWl7iZDIo8hRRx1lmzUz/TPPPKMfTyZOnJiZtjGBTBrLIjVWvFqj61gGhKRj6MNU/MILL+hNhWwfa6T2WIVEHm9kc6VDDz00DCRKyZ0AQpI74nwrkE4n8xAun+bHKiQyWStbPrqIY760Kb0VAYQk8dh49NFH9dsRl+0BYhUSeYskb5NOOumkxL1THfMRksR9XXvta7PHaq3JsQqJ7AFbew2cuHsqYz5Ckrir58+fr84++2ynVsQqJNIYn3Y5wSCTFwGExAtf5zP7dDiEpPP+K4sFCEninkRIEndgScxHSBJ3JHMkiTuwJOYjJIk7krc2iTuwJOYjJIk7knUkiTuwJOYjJIk7kpWtiTuwJOYjJIk7km9tEndgScxHSErgSJ+vf2P7aI+vf9MMSIQkTb8NsNp1P5IY15GwH0maAYmQpOm3AVa77pAmWyzKHIt8sh/6kq0N5Eydt73tbcZFs0OaMaroEiIk0bnEzSDXPVuXLFmidySTTh9qq0UZIW3btk1Nnz7dqjHs2WqFK6rEewmJrJQ866yzgm69F1WLS2qM6y7ysuGz7Egmh1SF2vxZDueSXddkI2jTi13kTUnFl05i7/77769/8zWot7e398EHH1SzZs3S2+RxpUWAc23S8ldZrJWvtRcuXKhOP/103SQtJPL5tpyNIsNdrvQIpHhqXYo2pxcZ+VksG4/LmUSyiXhdSB577DF92pnLuST5mUrJNgQ4+9eGFml9CcikvYyGTzzxxD4hWb16tf7HpEmTfMsnf4cIyEFZ8tZEjnSQSdRYr3Xr1imZmJW3RnIwFleaBBo1Qz/ayIlrcn6s7Yx7mgjKa7WseF22bJney9X2SIgiqEiMyd6sU6dOZbf4IoDnWIe8+ZMYkxMW6482MnMvM7BnnnlmkNeBOdpP0RkEZGSyfPlyPd9le+pdnnBlP1Z5rj7hhBMYieQJuoCyZQ3TggUL9Jve2ls6PSKRuuVOJvMknAxfgCcKqEJWi8oI5ZhjjnHaJDqUibKp86pVq/QIhB3iQ1HtbDkyNyJ/ZGRZu+pCsn79en2wdP8fO2sutfsSkMcI6cQybyKHdIc8ojPLNrk/yYI5mQ8RMXM5OiOrDn7vDAEZdMiLmXHjxu0tJPJ/ZD3JjBkz1IgRIzpjIbUGJ7Bjxw4lE2MyDzZhwgQtKnkKigiIiMfatWv187NM4A8bNix4uyiwMwRee+01JW8Ia+tH9hqRyP+QgJPAk4OgucpFQOYnpHPLalYZHcjdJOS6ISlfRrUyCpJVriJaIcsvlzfSbY180iA3hsY3vPVHG2maHC4tZ7DK2xuCIF1nt7NcPpKTDi/PuDIyOfjgg/VB5HJcps3KZlnZKMeGyjL3l156SclIRObXRKCGDx9eTngVb5XcLORtjZw5PXTo0AE0BgiJ/CJ3LQkO5krKHzUSGCICclSmiILMwMukqKzvkLuOfNAnYiMiITP1MlqVt0IyiStv+kR85OhQESNuPOWPF5kbkZuOjDYbr72ERBLIM5DcXWJe2FR+txXfwppIyN8y4hDxEBERMRFRkRGLiExNbIq3kBo7RUAWEsooVuZQm11NhUTuVD09PWrmzJkdfXXYKWjUCwEI9BGQV/iyI19XV1fLkWdTIZEiZNJMViKKAtk8O+MACECgPARkZCpPKLKKtd0r/JZCIijkLY7Ml0ybNo0Vr+WJDVoCASMC8mi7dOlSPS+S9R1eWyGR2mQDHJmIk6/8GJkY8ScRBJInICMR2RVAJtRlw6qsK1NIaiMTWfUqe5aMHDkyq0x+hwAEEiYgcyKy14isXs0aidSaaSQktTkT+X5j8uTJvM1JOEgwHQLtCMjbGdl0Sr6LsvmswVhIpHJ5myNfccpiFFEq1g4QlBAoBwHp2zInKotS5atx275tJSQ1ZLJoTT7IkqGPLE7h25xyBBOtqB4B+XZG+rNMXciHnc0Wm5lQcRISKViUSwyQoZBMyMgCNvnGIsTxBiaGkwYCEHAjIG9j5JsrWWAmL1Jk4akISOOyd5vSnYWkfyW1LQjEOHlVJMum999///oKSDEwzy9ObRpMWghUhYCsSpYbfm3Fspw7JJ9DyJIOuek3bgXgwyWIkNQMkO8vxEhROTFavsmQ7zOkMXv2T/KxlbwQgIAFAbl5y01cvpuSzxrk5i5PD3Kztzl/yKTKoEJiUiFpIACB8hFASMrnU1oEgcIJICSFI6dCCJSPAEJSPp/SIggUTgAhKRw5FUKgfAQQkvL5lBZBoHACCEnhyKkQAuUjgJCUz6e0CAKFE0BICkeeRoWyD83555+v7rrrrpb7dKbREqwsggBCUgTlROtYs2aNuvzyy9XcuXPZ1CpRHxZlNkJSFGnqgUCJCSAkJXYuTYNAUQQQkqJIUw8ESkwAISmxc2kaBIoigJAURZp6IFBiAghJiZ1L0yBQFAGEpCjS1AOBEhNASErsXJoGgaIIICRFkaYeCJSYAEJSYufSNAgURQAhKYo09UCgxAT+P20YyHJLIMXaAAAAAElFTkSuQmCC" style="cursor:pointer;max-width:100%;" onclick="(function(img){if(img.wnd!=null&&!img.wnd.closed){img.wnd.focus();}else{var r=function(evt){if(evt.data=='ready'&&evt.source==img.wnd){img.wnd.postMessage(decodeURIComponent(img.getAttribute('src')),'*');window.removeEventListener('message',r);}};window.addEventListener('message',r);img.wnd=window.open('https://www.draw.io/?client=1&lightbox=1&chrome=0&edit=_blank');}})(this);"/>

### Evaluation:
- [ ] App operates as asked
- [ ] No crashes or bugs
- [ ] SOLID principles
- [ ] Code is understandable and maintainable

### Bonus Points:
- [ ] unit & integration tests
- [ ] dependency injection
- [ ] functional/reactive